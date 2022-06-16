package sistema.integrador.oo2.services;

import java.time.LocalDate;
import java.util.List;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Espacio;



public interface IEspacioService {
	public List<Espacio> listar();
	public boolean insertOrUpdate(Espacio espacio);
	public Espacio findById(int id);
	public boolean remove(int id);
	//CU3
	public Espacio traer(LocalDate fecha, char turno, Aula aula);
	//CU4
	public boolean agregar(LocalDate fecha, char turno, Aula aula, boolean libre) throws Exception;
	//CU5
	public void agregarEspacioMes(int mes, int anio, char turno, Aula aula) throws Exception;
}
