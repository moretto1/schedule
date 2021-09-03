package moretto.bruno.schedule.services.impl;

import moretto.bruno.schedule.domain.bo.TaskBo;
import moretto.bruno.schedule.domain.dtos.TaskDto;
import moretto.bruno.schedule.domain.entities.Task;
import moretto.bruno.schedule.domain.mappers.Mapper;
import moretto.bruno.schedule.repositories.TaskRepository;
import moretto.bruno.schedule.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskBo taskBo;

    @Autowired
    private Mapper<TaskDto, Task> mapper;

    @Override
    public void create(TaskDto taskDto) {
        Task task = mapper.mapToEntity(taskDto, Task.class);
        taskBo.setCommonsData(task);
        taskRepository.save(task);
    }

}
