package sistema.integrador.oo2.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="final")
public class Final extends NotaPedido implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	
	@Column(name="fecha_examen", nullable=false)
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
