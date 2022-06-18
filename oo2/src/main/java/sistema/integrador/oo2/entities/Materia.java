package sistema.integrador.oo2.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="materia")
public class Materia implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "cod_materia", nullable = false)
	private int codMateria;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_carrera", nullable=false)
	private Carrera carrera;
	
	public Materia() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodMateria() {
		return codMateria;
	}

	public void setCodMateria(int codMateria) {
		this.codMateria = codMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Materia(int id, int codMateria, String nombre, Carrera carrera) {
		super();
		this.id = id; //no autoincremental
		this.codMateria = codMateria;
		this.nombre = nombre;
		this.carrera = carrera;
	}

	
	
}