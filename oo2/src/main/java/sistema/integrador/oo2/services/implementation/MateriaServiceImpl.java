package sistema.integrador.oo2.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.Materia;
import sistema.integrador.oo2.repositories.IMateriaRepositoryCRUD;
import sistema.integrador.oo2.services.IMateriaService;

@Service
public class MateriaServiceImpl implements IMateriaService {
	
	@Autowired
	public IMateriaRepositoryCRUD materiaRepositorio;
	
	public List<Materia> listar() {
		return materiaRepositorio.findAll();
	}

	@Override
	public Materia findById(int id) {
		return materiaRepositorio.findById(id).orElse(null);
	}

	@Override
	public boolean insertOrUpdate(Materia materia) {
		try {
			materiaRepositorio.save(materia);
			return true;
		}catch (Exception he){
			return false;
		}
	}

	@Override
	public boolean remove(int id) {
		try {
			materiaRepositorio.deleteById(id);
			return true;
		}catch(Exception he) {
			return false;
		}
	}
	
}
