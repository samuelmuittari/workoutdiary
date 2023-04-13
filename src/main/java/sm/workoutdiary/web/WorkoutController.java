package sm.workoutdiary.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sm.workoutdiary.domain.Workout;
import sm.workoutdiary.domain.WorkoutRepository;
// controlleri joka hoitaa pyynnöt thymeleaf templateille
@Controller
public class WorkoutController {

    @Autowired
    private WorkoutRepository workoutRepository;
    
    @RequestMapping(value = {"/", "/login"})
    public String login() {
        return "login";
    }

    @RequestMapping(value="/workoutlist", method = RequestMethod.GET)
    public String bookList(Model model){
        model.addAttribute("workouts", workoutRepository.findAll());
        return "workoutlist";
    }

    @RequestMapping(value = "/add")
    public String addWorkout(Model model) {
        model.addAttribute("workout", new Workout());
        return "addworkout";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Workout workout) {
        workoutRepository.save(workout);
        return "redirect:workoutlist";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteWorkout(Long workoutId) {
        workoutRepository.deleteById(workoutId);
        return "redirect:workoutlist";
    }

    @RequestMapping(value = "/edit/{workoutId}")
    public String editWorkout(@PathVariable("workoutId") Long workoutId, Model model){
        model.addAttribute("workout", workoutRepository.findById(workoutId).orElse(null));
        return "editworkout";
    }
}
