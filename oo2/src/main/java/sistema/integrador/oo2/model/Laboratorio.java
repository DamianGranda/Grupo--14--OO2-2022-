package sistema.integrador.oo2.model;

public class Laboratorio extends Aula {
	
	private int cantPc;
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
