package moretto.bruno.schedule.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import moretto.bruno.schedule.domain.entities.Task;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskPageDto {

    private Long id;

    @NotBlank(message = "name is required")
    private String name;

    private List<Task> tasks;

}
