package sm.workoutdiary.domain;

import org.springframework.data.repository.CrudRepository;
// repository joka hoitaa tietokantatoiminnot käyttäjille
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
