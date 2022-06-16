package sistema.integrador.oo2.services.implementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Espacio;
import sistema.integrador.oo2.repositories.IEspacioRepositoryCRUD;
import sistema.integrador.oo2.services.IEspacioService;

@Service("espacioService")

public class EspacioServiceImpl implements IEspacioService {
	
	@Autowired
	//@Qualifier("espacioRepository")
	private IEspacioRepositoryCRUD espacioRepository;

	@Override
	public List<Espacio> listar() {
		return espacioRepository.findAll();
	}

	@Override
	public boolean insertOrUpdate(Espacio espacio) {
		try {
			espacioRepository.save(espacio);
			return true;
		}catch (Exception he){
			return false;
		}
	}

	@Override
	public Espacio findById(int id) {
		return espacioRepository.findById(id).orElse(null);
	}

	@Override
	public boolean remove(int id) {
		try {
			espacioRepository.deleteById(id);
			return true;
		}catch(Exception he) {
			return false;
		}
	}
	
	@Override
	public Espacio traer(LocalDate fecha, char turno, Aula aula) {
		return espacioRepository.traer(fecha, turno, aula);//CU 3, LO TRAE CON UNA QUERY
	}

	@Override //CU4
	public boolean agregar(LocalDate fecha, char turno, Aula aula, boolean libre) throws Exception {
		Espacio e = traer(fecha, turno, aula);//CU 3
		if(e != null) {
			throw new Exception("Ya existe ese espacio!");
		}
		Espacio es = new Espacio(fecha, turno, aula, libre);

		try {
			espacioRepository.save(es);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	@Override //CU5 
	public void agregarEspacioMes(int mes, int anio, char turno, Aula aula) throws Exception {
		List<Espacio> aux = espacioRepository.findAll();
		for(Espacio pp : aux) {
			LocalDate hoy = LocalDate.now();
			LocalDate maniana = hoy.plusDays(1);
			LocalDate fecha = traerFecha(anio, mes, maniana.getDayOfMonth());
			Espacio espacio = this.traer(fecha, pp.getTurno(), pp.getAula());
			if(espacio.isLibre()) {
				agregar(pp.getFecha(), turno, aula, true);
			}
		}
		
	}
	public static LocalDate traerFecha(int anio, int mes, int dia) {
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		return fecha;
	}

}
