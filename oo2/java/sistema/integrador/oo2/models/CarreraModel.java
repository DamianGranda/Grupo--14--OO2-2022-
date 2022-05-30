package sistema.integrador.oo2.models;

import sistema.integrador.oo2.entities.Departamento;

public class CarreraModel {
	
	private int id;
	private String carrera;
	private Departamento departamento;
	
	public CarreraModel() {}
	
	
	
	public CarreraModel(int id, String carrera, Departamento departamento) {
		super();
		this.id = id;
		this.carrera = carrera;
		this.departamento = departamento;
	}



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

	@Override
	public String toString() {
		return "CarreraModel [id=" + id + ", carrera=" + carrera + ", departamento=" + departamento + "]";
	}

	
}
