package sistema.integrador.oo2.models;

public class PerfilModel {
	
	private int idPerfil;
	private String descripcion;
	private String tipoPerfil;
	
	public PerfilModel() {
		super();
	}

	public PerfilModel(int idPerfil, String descripcion, String tipoPerfil) {
		super();
		this.idPerfil = idPerfil;
		this.descripcion = descripcion;
		this.tipoPerfil = tipoPerfil;
	}

	public int getIdPefil() {
		return idPerfil;
	}

	public void setIdPefil(int idPefil) {
		this.idPerfil = idPefil;
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
		return "PerfilModel [idPefil=" + idPerfil + ", descripcion=" + descripcion + ", tipoPerfil=" + tipoPerfil + "]";
	}
	
	
}
