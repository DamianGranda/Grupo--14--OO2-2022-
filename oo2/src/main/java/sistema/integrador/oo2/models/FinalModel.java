package sistema.integrador.oo2.models;

import java.time.LocalDate;


import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Materia;

public class FinalModel extends NotaPedidoModel {
	
	protected int id;
	private LocalDate fechaExamen;
	
	public FinalModel() {}
	
	public FinalModel(LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia, String observaciones,
			LocalDate fechaExamen) {
		super(fecha, turno, aula, cantEstudiantes, materia, observaciones);
		this.fechaExamen = fechaExamen;
	}

	public LocalDate getFechaExamen() {
		return fechaExamen;
	}

	public void setFechaExamen(LocalDate fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

	@Override
	public String toString() {
		return "FinalModel [id=" + id + ", fechaExamen=" + fechaExamen + "]";
	}
	
	
}	
