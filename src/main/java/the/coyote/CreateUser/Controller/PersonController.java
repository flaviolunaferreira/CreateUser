package the.coyote.CreateUser.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import the.coyote.CreateUser.DTO.messageResponseDTO;
import the.coyote.CreateUser.DTO.Request.PersonDTO;
import the.coyote.CreateUser.Service.PersonService;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public messageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
		return personService.createPerson(personDTO);
	}			
	
}
