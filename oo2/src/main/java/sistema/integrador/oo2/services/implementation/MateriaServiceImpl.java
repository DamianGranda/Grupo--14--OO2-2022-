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
	public IMateriaRepositoryCRUD repositorio;
	
	public List<Materia> listar() {
		return repositorio.findAll();
	}
	
}
