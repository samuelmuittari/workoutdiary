package sm.workoutdiary.domain;

import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {
    void deleteById(Long id);
}
