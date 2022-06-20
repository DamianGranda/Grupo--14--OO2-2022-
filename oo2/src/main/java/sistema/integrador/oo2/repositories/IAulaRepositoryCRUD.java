package sistema.integrador.oo2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Laboratorio;
import sistema.integrador.oo2.entities.Tradicional;

@Repository
public interface IAulaRepositoryCRUD extends JpaRepository<Aula, Integer>  {
	
	@Query("FROM Aula a inner join fetch a.edificio where a.id=(:id)") // El metodo del JpaRepository NO trae las hijas
	public Aula buscarPorID(int id);
	
	@Query(value = "SELECT * FROM aula INNER JOIN laboratorio ON aula.id = laboratorio.id",nativeQuery=true)
	public abstract List<Laboratorio> getLaboratorio();
	@Query(value = "SELECT * FROM aula INNER JOIN tradicional ON aula.id = tradicional.id",nativeQuery=true)
	public abstract List<Tradicional> getTradicional();
	
}
