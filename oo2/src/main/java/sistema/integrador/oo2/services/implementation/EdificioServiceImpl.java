package sistema.integrador.oo2.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.repositories.IEdificioRepositoryCRUD;

@Service()
public class EdificioServiceImpl {

	@Autowired
	
	private IEdificioRepositoryCRUD repositorio;
	
	public  List<Edificio> listar() {
		return repositorio.findAll();
	}
	
	public Edificio guardarEdificio(Edificio edificio) {
		return repositorio.save(edificio);
	}

	public Edificio obtenerEdificioPorId(Long id) {
		return repositorio.findById(id).get();
	}

	public Edificio actualizarUser(Edificio edificio) {
		return repositorio.save(edificio);
	}

	public void eliminarEdificio(Long id) {
		repositorio.deleteById(id);
	}
	
	
}
