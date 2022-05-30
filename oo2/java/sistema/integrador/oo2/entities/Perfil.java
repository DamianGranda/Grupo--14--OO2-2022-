package sistema.integrador.oo2.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="perfil")
public class Perfil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPerfil;
	
	@Column(name = "descripcion", nullable = false, length=255)
	private String descripcion;
	
	@Column(name = "tipo_perfil", nullable = false,length=50)
	private String tipoPerfil;
	
	@Column(name="createdat")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	public Perfil() {
		super();
	}

	public Perfil(int idPefil, String descripcion, String tipoPerfil) {
		super();
		this.idPerfil = idPefil;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
