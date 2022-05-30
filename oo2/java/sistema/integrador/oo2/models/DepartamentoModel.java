package sistema.integrador.oo2.models;



public class DepartamentoModel {
	
	private int id;
	private String departamento;
	
	public DepartamentoModel() {}
	
	public DepartamentoModel(int id, String departamento) {
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

	@Override
	public String toString() {
		return "DepartamentoModel [id=" + id + ", departamento=" + departamento + "]";
	}
	
}
