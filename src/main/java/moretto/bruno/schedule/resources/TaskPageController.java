package moretto.bruno.schedule.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import moretto.bruno.schedule.domain.dtos.TaskPageDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "Resources related to task pages", tags = "Task Pages Controller")
@RequestMapping(path = "/task-pages")
public interface TaskPageController {

    @ApiOperation(
            value = "Create a new task page",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 400, message = "Bad request")
    })
    @PostMapping
    ResponseEntity<?> createTaskPage(@RequestBody TaskPageDto taskPageDto);

    @ApiOperation(
            value = "Find a task page by id",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok"),
            @ApiResponse(code = 404, message = "Task page not found")
    })
    @GetMapping(path = "/{taskPageId}")
    ResponseEntity<TaskPageDto> findTaskPageById(@PathVariable Long taskPageId);

}
