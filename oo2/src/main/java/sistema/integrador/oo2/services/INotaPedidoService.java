package sistema.integrador.oo2.services;

import java.util.List;

import sistema.integrador.oo2.entities.NotaPedido;

public interface INotaPedidoService {
	public List<NotaPedido> listar();
	public boolean insertOrUpdate(NotaPedido notaPedido);
	public NotaPedido findById(int id);
	public boolean remove(int id);
}
