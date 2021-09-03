package moretto.bruno.schedule.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import moretto.bruno.schedule.domain.dtos.TaskDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Api(value = "Resources related to tasks", tags = "Task Controller")
@RequestMapping(path = "/tasks")
public interface TaskController {

    @ApiOperation(
            value = "Create a new task",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 400, message = "Bad request")
    })
    @PostMapping
    ResponseEntity<?> createTask(@RequestBody @Valid TaskDto taskDto);

}
