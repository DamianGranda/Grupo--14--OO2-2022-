package sistema.integrador.oo2.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.entities.Espacio;



@Repository
public interface IEspacioRepositoryCRUD extends JpaRepository <Espacio,Integer> {
	@Query("FROM Espacio e inner join fetch e.aula")
	public Espacio buscarPorFechaTurnoAula(LocalDate fecha, char turno, Aula aula); 
	
	@Query("FROM Espacio e inner join fetch e.aula where e.fecha=(:fecha) and turno=(:turno) and aula=(:aula) and libre=(:libre)")
	public int agregarPorFechaTurnoAulaLibre(LocalDate fecha, char turno, Aula aula, boolean libre); 
}
