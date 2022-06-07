package sistema.integrador.oo2.services.implementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.entities.Espacio;

import sistema.integrador.oo2.repositories.IEspacioRepositoryCRUD;

import sistema.integrador.oo2.services.IEspacioService;

@Service
public class EspacioServiceImpl implements IEspacioService{

	@Autowired
	private IEspacioRepositoryCRUD repositorio;
	
	@Override
	public  List<Espacio>listar() {
		return repositorio.findAll();
	}

	@Override
	public Espacio guardarEspacio(Espacio espacio) {
		return repositorio.save(espacio);
	}

	
	@Override
	public void eliminarEspacio(int id) {
		repositorio.deleteById(id);
	}

	@Override
	public Espacio obtenerEspacio(int id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Espacio actualizarEspacio(Espacio espacio) {
		return repositorio.save(espacio);
	}

	@Override
	public Espacio buscarPorFechaTurnoAula(LocalDate fecha, char turno, Aula aula) {
		return repositorio.buscarPorFechaTurnoAula(fecha,turno,aula);
		
	}
}
