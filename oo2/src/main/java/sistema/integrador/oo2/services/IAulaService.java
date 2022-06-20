package sistema.integrador.oo2.services;

import java.util.List;


import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Laboratorio;
import sistema.integrador.oo2.entities.Tradicional;



public interface IAulaService {
	
	public List<Aula> listar(); // traer la lista de todas las aulas
	public Aula guardarAula(Aula aula);
	public Aula obtenerAula(int id);// Trae el aula por id
	public Aula actualizarAula(Aula aula);
	public void eliminarAula(int id);
	public List<Aula> buscarPorEdificio_ID(int id);// Trae la lista de aulas a partir del edificio
	public List<Tradicional> getAllTradicional();
	public List<Laboratorio> getAllLaboratorio();
	
	
}
