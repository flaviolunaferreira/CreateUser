package the.coyote.CreateUser.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.CreateUser.Enums.PhoneType;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private PhoneType type;
	
	@Column(nullable = false)
	private String number;
	
}
