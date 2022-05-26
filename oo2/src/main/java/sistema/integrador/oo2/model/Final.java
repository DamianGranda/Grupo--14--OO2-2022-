package sistema.integrador.oo2.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Final")
public class Final extends NotaPedido implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="fechaExamen", nullable=false)
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
