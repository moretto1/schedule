package moretto.bruno.schedule.domain.bo.impl;

import moretto.bruno.schedule.domain.bo.TaskBo;
import moretto.bruno.schedule.domain.entities.Task;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskBoImpl implements TaskBo {

    @Override
    public void setCommonsData(Task task) {
        task.setCreationDate(LocalDateTime.now());
    }

}
