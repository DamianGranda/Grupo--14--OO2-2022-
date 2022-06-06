package sistema.integrador.oo2.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="edificio")
public class Edificio implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombre", nullable=true,length=30)
	private String nombre;
	
	@OneToMany(mappedBy = "edificio")
	private Set<Aula> aula;
	
	public Edificio() {}

	public Edificio(int id, String nombre, Set<Aula> aula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.aula = aula;
	}

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

	public Set<Aula> getAula() {
		return aula;
	}

	public void setAula(Set<Aula> aula) {
		this.aula = aula;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
