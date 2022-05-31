package sistema.integrador.oo2.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuario;
	
	@Column(name="nombre",nullable=false,length=255)
	private String nombre;
	
	@Column(name="apellido",nullable=false,length=255)
	private String apellido;
	
	@Column(name="tipo_doc",nullable=false,length=5)
	private String tipoDoc;
	
	@Column(name="documento",nullable=false)
	private long documento;
	
	@Column(name="email",nullable=false,length=255)
	private String Email;
	
	@Column(name="nombre_de_usuario",nullable=false,length=45)
	private String nombreDeUsuario;
	
	@Column(name="contraseña",nullable=false,length=60)
	private String contraseña;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@Column(name="createdat")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_perfil", nullable=false)
	private Perfil perfil;

	
	public Usuario() {
		super();
	}


	public Usuario(int idUsuario, String nombre, String apellido, String tipoDoc, long documento, String email,
			String nombreDeUsuario, String contraseña, Perfil perfil) {
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


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	public Perfil getPerfil() {
		return perfil;
	}


	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
