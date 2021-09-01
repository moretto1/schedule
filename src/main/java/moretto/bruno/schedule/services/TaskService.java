package moretto.bruno.schedule.services;

import moretto.bruno.schedule.domain.dtos.TaskDto;
import moretto.bruno.schedule.domain.entities.Task;
import moretto.bruno.schedule.domain.mappers.Mapper;
import moretto.bruno.schedule.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface TaskService {

    void create(TaskDto taskDto);

}
