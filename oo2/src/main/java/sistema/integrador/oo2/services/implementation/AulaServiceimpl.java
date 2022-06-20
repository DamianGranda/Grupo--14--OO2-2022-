package sistema.integrador.oo2.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Laboratorio;
import sistema.integrador.oo2.entities.Tradicional;
import sistema.integrador.oo2.repositories.IAulaRepositoryCRUD;
import sistema.integrador.oo2.services.IAulaService;
@Service
public class AulaServiceimpl implements IAulaService {
	
	@Autowired
	private IAulaRepositoryCRUD repositorio;

	@Override
	public List<Aula> listar() {
		return repositorio.findAll();
	}

	@Override
	public Aula guardarAula(Aula aula) {
		return repositorio.save(aula);
	}

	@Override
	public Aula obtenerAula(int id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Aula actualizarAula(Aula aula) {
		return repositorio.save(aula);
	}

	@Override
	public void eliminarAula(int id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<Aula> buscarPorEdificio_ID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tradicional> getAllTradicional() {
		return repositorio.getTradicional();
	}

	@Override
	public List<Laboratorio> getAllLaboratorio() {
		return repositorio.getLaboratorio();
	}


	/*@Override
	public List<Aula> buscarPorEdificio_ID(int id) {
		return repositorio.buscarPorEdificio_id(id);
	}*/

}
