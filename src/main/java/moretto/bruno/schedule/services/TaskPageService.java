package moretto.bruno.schedule.services;

import moretto.bruno.schedule.domain.dtos.TaskPageDto;

import java.util.List;

public interface TaskPageService {

    void create(TaskPageDto taskPageDto);

    TaskPageDto findById(Long id);

}
