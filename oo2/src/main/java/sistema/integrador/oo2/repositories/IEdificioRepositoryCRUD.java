package sistema.integrador.oo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sistema.integrador.oo2.entities.Edificio;


public interface IEdificioRepositoryCRUD extends JpaRepository<Edificio,Long> {


}
