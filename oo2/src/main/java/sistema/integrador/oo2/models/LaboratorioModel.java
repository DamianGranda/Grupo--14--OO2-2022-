package sistema.integrador.oo2.models;



import sistema.integrador.oo2.entities.Edificio;

public class LaboratorioModel extends AulaModel{
	
	
	private int cantPc;
	private int cantSillas;
	
	public LaboratorioModel() {}
	public LaboratorioModel(int numero, Edificio edificio, int cantPc, int cantSillas) {
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
	@Override
	public String toString() {
		return "LaboratorioModel [cantPc=" + cantPc + ", cantSillas=" + cantSillas + "]";
	}
	
}
