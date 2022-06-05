package sistema.integrador.oo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import sistema.integrador.oo2.entities.Edificio;

@Repository// tiene que estar?
public interface IEdificioRepositoryCRUD extends JpaRepository<Edificio,Integer> {
	
	@Query("FROM Edificio e inner join fetch e.aula where e.id=(:id)")
	public Edificio buscarPorIDYAulas(int id); // Para traer el edificio con sus respectivas aulas

}
