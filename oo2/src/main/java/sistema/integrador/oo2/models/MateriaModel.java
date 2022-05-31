package sistema.integrador.oo2.models;



import sistema.integrador.oo2.entities.Carrera;

public class MateriaModel {
	
	private int id;
	private int codMateria;
	private String materia;
	private Carrera carrera;
	
	public MateriaModel() {}
	
	public MateriaModel(int id, int codMateria, String materia, Carrera carrera) {
		super();
		this.id = id; //no autoincremental
		this.codMateria = codMateria;
		this.materia = materia;
		this.carrera = carrera;
	}
	
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "MateriaModel [id=" + id + ", codMateria=" + codMateria + ", materia=" + materia + ", carrera=" + carrera
				+ "]";
	}

	

}
