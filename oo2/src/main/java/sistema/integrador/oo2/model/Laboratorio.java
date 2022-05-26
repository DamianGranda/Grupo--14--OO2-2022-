package sistema.integrador.oo2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Laboratorio")
public class Laboratorio extends Aula implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "cantPc", nullable = false)
	private int cantPc;
	@Column(name = "cantSillas", nullable = false)
	private int cantSillas;
	
	public Laboratorio() {}
	public Laboratorio(int numero, Edificio edificio, int cantPc, int cantSillas) {
		super(numero, edificio);
		this.cantPc = cantPc;
		this.cantSillas = cantSillas;
	}

	public int getCantPc() {
		return cantPc;
	}

	public void setCantPc(int cantPc) {
		this.cantPc = cantPc;
	}

	public int getCantSillas() {
		return cantSillas;
	}

	public void setCantSillas(int cantSillas) {
		this.cantSillas = cantSillas;
	}
	
}
