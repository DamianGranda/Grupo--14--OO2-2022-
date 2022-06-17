package sistema.integrador.oo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistema.integrador.oo2.entities.Materia;

@Repository
public interface IMateriaRepositoryCRUD extends JpaRepository<Materia, Integer>{
	
}
