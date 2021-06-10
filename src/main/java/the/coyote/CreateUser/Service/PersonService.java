package the.coyote.CreateUser.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import the.coyote.CreateUser.DTO.messageResponseDTO;
import the.coyote.CreateUser.DTO.Request.PersonDTO;
import the.coyote.CreateUser.Entity.Person;
import the.coyote.CreateUser.Mapper.PersonMapper;
import the.coyote.CreateUser.Repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	private final PersonMapper personMapper = PersonMapper.INSTANCE;
	
	public messageResponseDTO createPerson(PersonDTO personDTO) {
		
		Person personToSave = personMapper.toModel(personDTO);
		
		Person savedPerson = personRepository.save(personToSave);
		return messageResponseDTO
				.builder()
				.message("Created Person with id " + savedPerson.getId()) 
				.build();
	}
	
}
