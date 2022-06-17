package sistema.integrador.oo2.services;

import java.util.List;

import sistema.integrador.oo2.entities.Departamento;



public interface IDepartamentoService {
	
	public List<Departamento> listar();
	public boolean insertOrUpdate(Departamento departamento);
	public Departamento findById(int id);
	public boolean remove(int id);
}
