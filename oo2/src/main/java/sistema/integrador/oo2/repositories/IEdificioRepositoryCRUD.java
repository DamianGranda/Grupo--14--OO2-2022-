package sistema.integrador.oo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistema.integrador.oo2.entities.Edificio;

@Repository
public interface IEdificioRepositoryCRUD extends JpaRepository<Edificio,Integer> {


}
