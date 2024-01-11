package app.car.cap01.domain;

import java.util.Date;
import lombok.Data; //Utilizar no local de criar getters e setters manualmente

@Data
public class Driver {
	
	Long id;
	String name;
	Date birthDate;

}
