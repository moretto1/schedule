package moretto.bruno.schedule.repositories;

import moretto.bruno.schedule.domain.entities.TaskPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskPageRepository extends JpaRepository<TaskPage, Long> {
}
