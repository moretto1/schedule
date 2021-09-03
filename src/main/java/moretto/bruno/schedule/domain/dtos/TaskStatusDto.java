package moretto.bruno.schedule.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskStatusDto {

    private Long id;

    @NotBlank(message = "status is required")
    private String status;

}
