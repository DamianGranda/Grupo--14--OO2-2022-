package sistema.integrador.oo2.model;

public class Carrera {
	
	private int id;
	private String carrera;
	private Departamento departamento;
	
	public Carrera() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Carrera(int id, String carrera, Departamento departamento) {
		super();
		this.id = id; //no autoincremental
		this.carrera = carrera;
		this.departamento = departamento;
	}

	
	
	
}
