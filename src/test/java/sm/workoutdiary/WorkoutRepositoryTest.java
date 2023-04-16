/*package sm.workoutdiary;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import sm.workoutdiary.domain.Workout;
import sm.workoutdiary.domain.WorkoutRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class WorkoutRepositoryTest {
    @Autowired
    private WorkoutRepository repository;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void findByNameShouldReturnWorkout() {
        List<Workout> workouts = repository.findByName("Running");
        
        assertThat(workouts).hasSize(1);
        assertThat(workouts.get(0).getName()).isEqualTo("Running");
    }

    @Test 
    public void createNewWorkout() {
        Workout workout = new Workout("Walking", "Walking in the park", "2021-05-01", "12:00", "1h");
        repository.save(workout);
        assertThat(workout.getId()).isNotNull();
    }

    @Test
    public void deleteWorkout() {
        Workout workout = new Workout("Walking", "Walking in the park", "2021-05-01", "12:00", "1h");
        entityManager.persist(workout);
        repository.deleteById(workout.getId());
        assertThat(repository.findById(workout.getId())).isEmpty();
    }
}   
*/