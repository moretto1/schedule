package moretto.bruno.schedule.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import moretto.bruno.schedule.domain.entities.Task;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskPageDto {

    private Long id;

    private String name;

    private List<Task> tasks;

}
