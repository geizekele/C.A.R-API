package app.car.cap01.domain;

import java.util.Date;
import javax.persistence.Entity; //Necessario adicionar V1 no pom.xml (reflete estado do DB)
import javax.persistence.Id;
import lombok.Data; //Utilizar no local de criar getters e setters manualmente

@Data
@Entity
public class Driver {
	
	@Id
	Long id;
	String name;
	Date birthDate;

}
