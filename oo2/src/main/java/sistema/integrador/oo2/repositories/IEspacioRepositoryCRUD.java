package sistema.integrador.oo2.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Espacio;



public interface IEspacioRepositoryCRUD extends JpaRepository<Espacio, Integer> {
	
	@Query(value = "SELECT * FROM ESPACIO INNER JOIN AULA WHERE ESPACIO.FECHA=:fecha and ESPACIO.TURNO=:turno and AULA.ID=:#{#aula.id}", nativeQuery=true)
	public abstract Espacio traer(LocalDate fecha, char turno, @Param("aula") Aula aula); 

}
