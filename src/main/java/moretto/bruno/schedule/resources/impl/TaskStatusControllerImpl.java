package moretto.bruno.schedule.resources.impl;

import moretto.bruno.schedule.domain.dtos.TaskStatusDto;
import moretto.bruno.schedule.resources.TaskStatusController;
import moretto.bruno.schedule.services.TaskStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskStatusControllerImpl implements TaskStatusController {

    @Autowired
    private TaskStatusService taskStatusService;

    @Override
    public ResponseEntity<?> createTaskStatus(TaskStatusDto taskStatusDto) {
        taskStatusService.create(taskStatusDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
