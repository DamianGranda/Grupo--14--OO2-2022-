package sistema.integrador.oo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sistema.integrador.oo2.entities.Departamento;



public interface IDepartamentoRepositoryCRUD extends JpaRepository<Departamento, Integer> {

}
