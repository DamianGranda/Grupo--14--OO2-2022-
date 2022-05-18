package sistema.integrador.oo2.model;

public class Departamento {
	
	private int id;
	private String departamento;
	public Departamento() {}
	public Departamento(int id, String departamento) {
		super();
		this.id = id;
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
