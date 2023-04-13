package sm.workoutdiary.domain;

import org.springframework.data.repository.CrudRepository;
// repository joka hoitaa tietokantatoiminnot treeneille
public interface WorkoutRepository extends CrudRepository<Workout, Long> {
    void deleteById(Long id);
}
