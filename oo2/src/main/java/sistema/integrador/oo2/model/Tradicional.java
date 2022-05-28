package sistema.integrador.oo2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="tradicional")
public class Tradicional extends Aula implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="cant_bancos", nullable=false)
	private int cantBancos;
	@Column(name="pizarron", nullable=false)
	private String pizarron;
	@Column(name="tiene_proyector", nullable=false)
	private boolean tieneProyector;
	
	public Tradicional() {}
	public Tradicional(int numero, Edificio edificio, int cantBancos, String pizarron, boolean tieneProyector) {
		super(numero, edificio);
		this.cantBancos = cantBancos;
		this.pizarron = pizarron;
		this.tieneProyector = tieneProyector;
	}

	public int getCantBancos() {
		return cantBancos;
	}

	public void setCantBancos(int cantBancos) {
		this.cantBancos = cantBancos;
	}

	public String getPizarron() {
		return pizarron;
	}

	public void setPizarron(String pizarron) {
		this.pizarron = pizarron;
	}

	public boolean isTieneProyector() {
		return tieneProyector;
	}

	public void setTieneProyector(boolean tieneProyector) {
		this.tieneProyector = tieneProyector;
	}
	
	
	
}

