package moretto.bruno.schedule.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import moretto.bruno.schedule.domain.entities.TaskStatus;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private Long id;

    @NotBlank(message = "name is required")
    private String name;

    private String details;

    @NotNull(message = "taskPageId is required")
    private Long taskPageId;

    private TaskStatus status;

    @NotBlank(message = "priority is required")
    private String priority;

    private LocalDateTime creationDate;

    private LocalDateTime endDate;

}
