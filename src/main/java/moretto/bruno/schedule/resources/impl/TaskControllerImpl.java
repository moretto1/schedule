package moretto.bruno.schedule.resources.impl;

import moretto.bruno.schedule.domain.dtos.TaskDto;
import moretto.bruno.schedule.resources.TaskController;
import moretto.bruno.schedule.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskControllerImpl implements TaskController {

    @Autowired
    private TaskService taskService;

    @Override
    public ResponseEntity<?> createTask(TaskDto taskDto) {
        taskService.create(taskDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
