package moretto.bruno.schedule.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import moretto.bruno.schedule.domain.entities.TaskStatus;

import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private Long id;

    private String name;

    private String details;

    private Long taskPageId;

    private TaskStatus status;

    private String priority;

    private LocalDateTime creationDate;

    private LocalDateTime endDate;

}
