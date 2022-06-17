package sistema.integrador.oo2.services;

import java.util.List;
import sistema.integrador.oo2.entities.Carrera;

public interface ICarreraService {

	public List<Carrera> listar();
	public boolean insertOrUpdate(Carrera carrera);
	public Carrera findById(int id);
	public boolean remove(int id);
}
