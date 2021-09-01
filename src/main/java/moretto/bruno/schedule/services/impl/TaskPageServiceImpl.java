package moretto.bruno.schedule.services.impl;

import moretto.bruno.schedule.domain.dtos.TaskPageDto;
import moretto.bruno.schedule.domain.entities.TaskPage;
import moretto.bruno.schedule.domain.mappers.Mapper;
import moretto.bruno.schedule.repositories.TaskPageRepository;
import moretto.bruno.schedule.services.TaskPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TaskPageServiceImpl implements TaskPageService {

    @Autowired
    private TaskPageRepository taskPageRepository;

    @Autowired
    private Mapper<TaskPageDto, TaskPage> mapper;

    @Override
    public void create(TaskPageDto taskPageDto) {
        TaskPage taskPage = mapper.mapToEntity(taskPageDto, TaskPage.class);
        taskPage = taskPageRepository.save(taskPage);
    }

    @Override
    public TaskPageDto findById(Long id) {
        Optional<TaskPage> taskPageOpt = taskPageRepository.findById(id);
        TaskPage taskPage = taskPageOpt.orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Task page not found"
        ));
        return mapper.mapToDto(taskPage, TaskPageDto.class);

    }

}
