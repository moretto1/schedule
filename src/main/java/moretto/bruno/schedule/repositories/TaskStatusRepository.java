package moretto.bruno.schedule.repositories;

import moretto.bruno.schedule.domain.entities.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {
}
