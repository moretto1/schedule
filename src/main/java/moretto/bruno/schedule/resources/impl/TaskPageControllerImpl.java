package moretto.bruno.schedule.resources.impl;

import moretto.bruno.schedule.resources.TaskPageController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskPageControllerImpl implements TaskPageController {

    @Override
    public ResponseEntity<?> createTaskPage() {
        return null;
    }

}
