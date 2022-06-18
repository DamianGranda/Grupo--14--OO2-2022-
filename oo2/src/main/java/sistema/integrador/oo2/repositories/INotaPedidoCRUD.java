package sistema.integrador.oo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistema.integrador.oo2.entities.NotaPedido;

@Repository
public interface INotaPedidoCRUD extends JpaRepository<NotaPedido, Integer>{

}
