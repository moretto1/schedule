package moretto.bruno.schedule.services.impl;

import moretto.bruno.schedule.domain.bo.TaskBo;
import moretto.bruno.schedule.domain.dtos.TaskDto;
import moretto.bruno.schedule.domain.dtos.TaskPageDto;
import moretto.bruno.schedule.domain.entities.Task;
import moretto.bruno.schedule.domain.entities.TaskPage;
import moretto.bruno.schedule.domain.mappers.Mapper;
import moretto.bruno.schedule.repositories.TaskRepository;
import moretto.bruno.schedule.services.TaskPageService;
import moretto.bruno.schedule.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskBo taskBo;

    @Autowired
    private TaskPageService taskPageService;

    @Autowired
    private Mapper<TaskDto, Task> mapper;

    @Override
    public void create(TaskDto taskDto) {
        Task task = mapper.mapToEntity(taskDto, Task.class);
        checkIfExistsTaskPage(taskDto.getTaskPageId());
        taskBo.setCommonsData(task);
        taskRepository.save(task);
    }

    @Override
    public TaskDto update(TaskDto taskDto) {
        Task task = mapper.mapToEntity(taskDto, Task.class);
        task = taskRepository.save(task);
        return mapper.mapToDto(task, TaskDto.class);
    }

    private boolean checkIfExistsTaskPage(Long taskPageId) {
        var taskPage = taskPageService.findById(taskPageId);
        return Objects.nonNull(taskPage);
    }

}
