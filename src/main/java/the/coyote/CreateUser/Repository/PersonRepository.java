package the.coyote.CreateUser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import the.coyote.CreateUser.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
