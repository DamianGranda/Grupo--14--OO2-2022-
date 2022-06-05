package sistema.integrador.oo2.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.repositories.IEdificioRepositoryCRUD;
import sistema.integrador.oo2.services.IEdificioService;

@Service
public class EdificioServiceImpl implements IEdificioService {

	
	@Autowired
	private IEdificioRepositoryCRUD repositorio;
	
	@Override
	public  List<Edificio> listar() {
		return repositorio.findAll();
	}

	@Override
	public Edificio guardarEdificio(Edificio edificio) {
		return repositorio.save(edificio);
	}

	
	@Override
	public void eliminarEdificio(int id) {
		repositorio.deleteById(id);
	}

	@Override
	public Edificio obtenerEdificio(int id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Edificio actualizarEdificio(Edificio edificio) {
		return repositorio.save(edificio);
	}
	
	
}
