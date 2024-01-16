// Meio de acesso ao banco de dados
package app.car.cap01.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository
	extends JpaRepository<Driver, Long>{
}
