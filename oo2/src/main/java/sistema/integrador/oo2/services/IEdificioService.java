package sistema.integrador.oo2.services;

import java.util.List;

import sistema.integrador.oo2.entities.Edificio;


public interface IEdificioService {
	public List<Edificio>listar();
	public Edificio guardarEdificio(Edificio edificio);
	public Edificio obtenerEdificio(int id);
	public Edificio actualizarEdificio(Edificio edificio);
	public void eliminarEdificio(int id);
}
