package sm.workoutdiary.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
// repository joka hoitaa tietokantatoiminnot treeneille
public interface WorkoutRepository extends CrudRepository<Workout, Long> {
    List<Workout> findByName(String name);
    void deleteById(Long id);
}
