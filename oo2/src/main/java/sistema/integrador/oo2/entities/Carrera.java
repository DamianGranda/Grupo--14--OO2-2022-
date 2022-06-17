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
@Table(name="carrera")
public class Carrera implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre", nullable=false, length=45)
	private String nombre;
	
	@ManyToOne()
	@JoinColumn(name="id_departamento", nullable=false)
	private Departamento departamento;
	
	public Carrera() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Carrera(int id, String nombre, Departamento departamento) {
		super();
		this.id = id; //no autoincremental
		this.nombre = nombre;
		this.departamento = departamento;
	}

	
	
	
}
