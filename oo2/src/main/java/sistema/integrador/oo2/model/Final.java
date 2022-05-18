package sistema.integrador.oo2.model;

import java.time.LocalDate;

public class Final extends NotaPedido {
	
	private LocalDate fechaExamen;
	
	public Final() {}
	public Final(LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia, String observaciones,
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
	
	
}
