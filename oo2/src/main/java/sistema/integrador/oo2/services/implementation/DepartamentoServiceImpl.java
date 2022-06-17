package sistema.integrador.oo2.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.Departamento;
import sistema.integrador.oo2.repositories.IDepartamentoRepositoryCRUD;
import sistema.integrador.oo2.services.IDepartamentoService;



@Service("departamentoService")
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	@Autowired
	
	private IDepartamentoRepositoryCRUD departamentoRepository;

	@Override
	public List<Departamento> listar() {
		return departamentoRepository.findAll();
	}

	@Override
	public boolean insertOrUpdate(Departamento departamento) {
		try {
			departamentoRepository.save(departamento);
			return true;
		}catch(Exception he) {
			return false;
		}
	}

	@Override
	public Departamento findById(int id) {
		return departamentoRepository.findById(id).orElse(null);
	}

	@Override
	public boolean remove(int id) {
		try {
			departamentoRepository.deleteById(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	
}
