package sistema.integrador.oo2.services;


import java.util.List;


import sistema.integrador.oo2.entities.Materia;

public interface IMateriaService {
	public List<Materia> listar();
	public Materia findById(int id);
	public boolean insertOrUpdate(Materia materia);
	public boolean remove(int id);
}
