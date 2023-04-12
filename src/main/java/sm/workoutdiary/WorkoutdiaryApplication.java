package sm.workoutdiary;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sm.workoutdiary.domain.Workout;
import sm.workoutdiary.domain.WorkoutRepository;

@SpringBootApplication
public class WorkoutdiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutdiaryApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(WorkoutRepository repository) {
		return (args) -> {
			repository.save(new Workout("Running", "Running in the park", "2021-05-01", "12:00", "1h"));
			repository.save(new Workout("Cycling", "Cycling in the park", "2021-05-02", "13:00", "1h"));
			repository.save(new Workout("Swimming", "Swimming in the pool", "2021-05-03", "14:00", "1h"));
			repository.save(new Workout("Walking", "Walking in the park", "2021-05-04", "15:00", "1h"));
			repository.save(new Workout("Hiking", "Hiking in the mountains", "2021-05-05", "16:00", "1h"));
		};
	}
}
