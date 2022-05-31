package sistema.integrador.oo2.models;

import java.time.LocalDateTime;

import javax.validation.constraints.Pattern;



import sistema.integrador.oo2.entities.Perfil;

public class UsuarioModel {
	
	

		private int idUsuario;
		private String nombre;
		
		
		
		private String apellido;
		private String tipoDoc;
		private long documento;
		
		
		@Pattern(regexp="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message="Ingrese un email correcto")
		private String email;
		private String nombre_de_usuario;
		private String contraseña;
		private boolean enabled;
		private LocalDateTime createdAt;
		private Perfil perfil;
		private int idPerfil;
		
		public UsuarioModel() {}

		public UsuarioModel(int idUsuario, String nombre, String apellido, String tipoDoc, long documento,
				@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Ingrese un email correcto") String email,
				String nombre_de_usuario, String contraseña, boolean enabled, LocalDateTime createdAt, Perfil perfil,
				int idPerfil) {
			super();
			this.idUsuario = idUsuario;
			this.nombre = nombre;
			this.apellido = apellido;
			this.tipoDoc = tipoDoc;
			this.documento = documento;
			this.email = email;
			this.nombre_de_usuario = nombre_de_usuario;
			this.contraseña = contraseña;
			this.enabled = enabled;
			this.createdAt = createdAt;
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
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNombre_de_usuario() {
			return nombre_de_usuario;
		}

		public void setNombre_de_usuario(String nombre_de_usuario) {
			this.nombre_de_usuario = nombre_de_usuario;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
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
			return "UsuarioModel [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido
					+ ", tipoDoc=" + tipoDoc + ", documento=" + documento + ", email=" + email + ", nombre_de_usuario="
					+ nombre_de_usuario + ", contraseña=" + contraseña + ", enabled=" + enabled + ", createdAt="
					+ createdAt + ", perfil=" + perfil + ", idPerfil=" + idPerfil + "]";
		}

	

}
