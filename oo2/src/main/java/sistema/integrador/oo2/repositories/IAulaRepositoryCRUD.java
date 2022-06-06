package sistema.integrador.oo2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sistema.integrador.oo2.entities.Aula;

@Repository
public interface IAulaRepositoryCRUD extends JpaRepository<Aula, Integer>  {
	
	@Query("FROM Aula a WHERE a.id = (:id)") // El metodo del JpaRepository NO trae las hijas
	public Aula buscarPorID(int idClassroom);
	
	public List<Aula> buscarPorEdificio_id(int id);
}
