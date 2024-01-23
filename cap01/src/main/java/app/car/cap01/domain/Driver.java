package app.car.cap01.domain;

import java.util.Date;
import jakarta.persistence.Entity; //Necessario adicionar V1 no pom.xml (reflete estado do DB)
import jakarta.persistence.Id;
import lombok.Data; //Utilizar no local de criar getters e setters manualmente

@Data
@Entity
public class Driver {
	
	@Id
	Long id;
	String name;
	Date birthDate;

}
