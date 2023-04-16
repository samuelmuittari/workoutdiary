package sm.workoutdiary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

import sm.workoutdiary.web.WorkoutController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class WorkoutdiaryApplicationTests {

	@Autowired
	private WorkoutController controller;
	/*@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	} */

}
