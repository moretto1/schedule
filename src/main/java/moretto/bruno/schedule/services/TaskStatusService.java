package moretto.bruno.schedule.services;

import moretto.bruno.schedule.domain.dtos.TaskStatusDto;

public interface TaskStatusService {

    void create(TaskStatusDto taskStatusDto);

}