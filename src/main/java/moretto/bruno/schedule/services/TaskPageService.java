package moretto.bruno.schedule.services;

import moretto.bruno.schedule.domain.dtos.TaskPageDto;

public interface TaskPageService {

    void create(TaskPageDto taskPageDto);

    TaskPageDto findById(Long id);

}
