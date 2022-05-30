package sistema.integrador.oo2.models;



import sistema.integrador.oo2.entities.Edificio;

public class TradicionalModel extends AulaModel {
	
	
	private int cantBancos;
	private String pizarron;
	private boolean tieneProyector;
	
	public TradicionalModel() {}
	
	public TradicionalModel(int numero, Edificio edificio, int cantBancos, String pizarron, boolean tieneProyector) {
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

	@Override
	public String toString() {
		return "TradicionalModel [cantBancos=" + cantBancos + ", pizarron=" + pizarron + ", tieneProyector="
				+ tieneProyector + "]";
	}
	
	
}
