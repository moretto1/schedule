package moretto.bruno.schedule.services.impl;

import moretto.bruno.schedule.domain.dtos.TaskStatusDto;
import moretto.bruno.schedule.domain.entities.TaskStatus;
import moretto.bruno.schedule.domain.mappers.Mapper;
import moretto.bruno.schedule.repositories.TaskStatusRepository;
import moretto.bruno.schedule.services.TaskStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskStatusServiceImpl implements TaskStatusService {

    @Autowired
    private TaskStatusRepository taskStatusRepository;

    @Autowired
    private Mapper<TaskStatusDto, TaskStatus> mapper;

    @Override
    public void create(TaskStatusDto taskStatusDto) {
        TaskStatus taskStatus = mapper.mapToEntity(taskStatusDto, TaskStatus.class);
        taskStatusRepository.save(taskStatus);
    }

}
