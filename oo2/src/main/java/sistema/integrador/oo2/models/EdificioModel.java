package sistema.integrador.oo2.models;


import java.util.Set;

import sistema.integrador.oo2.entities.Aula;

public class EdificioModel{
	private int id;
	private String edificio;
	private Set<Aula> aula;
	
	public EdificioModel() {}
	
	public EdificioModel(int id, String edificio, Set<Aula> aula) {
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

	@Override
	public String toString() {
		return "EdificioModel [id=" + id + ", edificio=" + edificio + ", aula=" + aula + "]";
	}
	
}