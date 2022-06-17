package sistema.integrador.oo2.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.Carrera;
import sistema.integrador.oo2.repositories.ICarreraRepository;
import sistema.integrador.oo2.services.ICarreraService;

@Service
public class CarreraServiceImpl implements ICarreraService{

	@Autowired
	//@Qualifier("carreraRepository")
	private ICarreraRepository carreraRepository;
	
	@Override
	public List<Carrera> listar() {
		return carreraRepository.findAll();
	}

	@Override
	public boolean insertOrUpdate(Carrera carrera) {
		try {
			carreraRepository.save(carrera);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public Carrera findById(int id) {
		return carreraRepository.findById(id).orElse(null);
	}

	@Override
	public boolean remove(int id) {
		try {
			carreraRepository.deleteById(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
