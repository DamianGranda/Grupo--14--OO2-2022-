package sistema.integrador.oo2.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="final")
public class Final extends NotaPedido implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="fecha_examen", nullable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")

	private LocalDate fechaExamen;
	
	public Final() {}
	
	

	public Final(int id, LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia,
			String observaciones, boolean estado, LocalDate fechaExamen) {
		super(id, fecha, turno, aula, cantEstudiantes, materia, observaciones, estado);
		this.fechaExamen = fechaExamen;
	}


	public LocalDate getFechaExamen() {
		return fechaExamen;
	}

	public void setFechaExamen(LocalDate fechaExamen) {
		this.fechaExamen = fechaExamen;
	}
	
	
}
