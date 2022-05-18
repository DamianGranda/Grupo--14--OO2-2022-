package sistema.integrador.oo2.model;

import java.util.Set;

public class Edificio {
	
	private int id;
	private String edificio;
	private Set<Aula> aula;
	
	public Edificio() {}
	public Edificio(int id, String edificio, Set<Aula> aula) {
		super();
		this.id = id;
		this.edificio = edificio;
		this.aula = aula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public Set<Aula> getAula() {
		return aula;
	}

	public void setAula(Set<Aula> aula) {
		this.aula = aula;
	}
	
	
}
