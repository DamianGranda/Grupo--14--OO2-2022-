package sistema.integrador.oo2.models;

import sistema.integrador.oo2.entities.Perfil;

public class UsuarioModel {
	
	private int idUsuario;
	private String nombre;
	private String apellido;
	private String tipoDoc;
	private long documento;
	private String Email;
	private String nombreDeUsuario;
	private String contraseña;
	
	private Perfil perfil;
	private int idPerfil;
	
	public UsuarioModel() {
		super();
	}

	public UsuarioModel(int idUsuario, String nombre, String apellido, String tipoDoc, long documento, String email,
			String nombreDeUsuario, String contraseña, Perfil perfil, int idPerfil) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDoc = tipoDoc;
		this.documento = documento;
		Email = email;
		this.nombreDeUsuario = nombreDeUsuario;
		this.contraseña = contraseña;
		this.perfil = perfil;
		this.idPerfil = idPerfil;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	@Override
	public String toString() {
		return "UsuarioModel [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoDoc="
				+ tipoDoc + ", documento=" + documento + ", Email=" + Email + ", nombreDeUsuario=" + nombreDeUsuario
				+ ", contraseña=" + contraseña + ", idPerfil=" + idPerfil + "]";
	}
	
	
}
