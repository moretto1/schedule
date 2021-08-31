package moretto.bruno.schedule.domain.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String details;

    @OneToOne
    private TaskStatus status;

    private String priority;

    private LocalDateTime creationDate;

    private LocalDateTime endDate;

}
