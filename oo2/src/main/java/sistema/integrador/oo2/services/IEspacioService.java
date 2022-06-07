package sistema.integrador.oo2.services;

import java.time.LocalDate;
import java.util.List;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Espacio;

public interface IEspacioService {
	public List<Espacio>listar();
	public Espacio guardarEspacio(Espacio espacio);
	public Espacio obtenerEspacio(int id);
	public Espacio actualizarEspacio(Espacio espacio);
	public void eliminarEspacio(int id);
	public Espacio buscarPorFechaTurnoAula(LocalDate fecha, char turno, Aula aula);
}
