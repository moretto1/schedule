package moretto.bruno.schedule.resources.impl;

import moretto.bruno.schedule.domain.dtos.TaskPageDto;
import moretto.bruno.schedule.resources.TaskPageController;
import moretto.bruno.schedule.services.TaskPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskPageControllerImpl implements TaskPageController {

    @Autowired
    private TaskPageService taskPageService;

    @Override
    public ResponseEntity<?> createTaskPage(TaskPageDto taskPageDto) {
        taskPageService.create(taskPageDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<TaskPageDto> findTaskPageById(Long taskPageId) {
        return ResponseEntity.ok(taskPageService.findById(taskPageId));
    }

}
