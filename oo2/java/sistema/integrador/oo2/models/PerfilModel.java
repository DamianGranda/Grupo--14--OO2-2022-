package sistema.integrador.oo2.models;

public class PerfilModel {
	
	private int idPefil;
	private String descripcion;
	private String tipoPerfil;
	
	public PerfilModel() {
		super();
	}

	public PerfilModel(int idPefil, String descripcion, String tipoPerfil) {
		super();
		this.idPefil = idPefil;
		this.descripcion = descripcion;
		this.tipoPerfil = tipoPerfil;
	}

	public int getIdPefil() {
		return idPefil;
	}

	public void setIdPefil(int idPefil) {
		this.idPefil = idPefil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoPerfil() {
		return tipoPerfil;
	}

	public void setTipoPerfil(String tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

	@Override
	public String toString() {
		return "PerfilModel [idPefil=" + idPefil + ", descripcion=" + descripcion + ", tipoPerfil=" + tipoPerfil + "]";
	}
	
	
}
