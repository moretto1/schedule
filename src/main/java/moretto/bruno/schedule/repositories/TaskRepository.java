package moretto.bruno.schedule.repositories;

import moretto.bruno.schedule.domain.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
