package sistema.integrador.oo2.entities;

import java.io.Serializable;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="nota_pedido")
@Inheritance(
	    strategy = InheritanceType.JOINED
	)
public abstract class NotaPedido implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	
	@Column(name="fecha", nullable=false)
	protected LocalDate fecha;
	
	@Column(name="turno", nullable=false)
	protected char turno;
	
	@ManyToOne
	@JoinColumn(name="idAula", nullable=false)
	protected Aula aula;
	
	@Column(name="cant_estudiantes", nullable=false)
	protected int cantEstudiantes;
	
	@ManyToOne
	@JoinColumn(name="id_materia", nullable=false)
	protected Materia materia;
	
	@Column(name="observaciones", nullable=false)
	protected String observaciones;
	
	public NotaPedido() {}
	
	public NotaPedido(LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia,
			String observaciones) {
		super();
		this.fecha = fecha;
		this.turno = turno;
		this.aula = aula;
		this.cantEstudiantes = cantEstudiantes;
		this.materia = materia;
		this.observaciones = observaciones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public int getCantEstudiantes() {
		return cantEstudiantes;
	}

	public void setCantEstudiantes(int cantEstudiantes) {
		this.cantEstudiantes = cantEstudiantes;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}

