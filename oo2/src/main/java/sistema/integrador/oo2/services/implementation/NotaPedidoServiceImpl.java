package sistema.integrador.oo2.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.NotaPedido;
import sistema.integrador.oo2.repositories.INotaPedidoCRUD;
import sistema.integrador.oo2.services.INotaPedidoService;

@Service
public class NotaPedidoServiceImpl implements INotaPedidoService {

	@Autowired
	INotaPedidoCRUD notaPedidoRepository;
	
	@Override
	public List<NotaPedido> listar() {
		return notaPedidoRepository.findAll();
	}
	@Override
	public boolean insertOrUpdate(NotaPedido notaPedido) {
		try {
			notaPedidoRepository.save(notaPedido);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public NotaPedido findById(int id) {
		return notaPedidoRepository.findById(id).orElse(null);
	}

	@Override
	public boolean remove(int id) {
		try {
			notaPedidoRepository.deleteById(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

}
