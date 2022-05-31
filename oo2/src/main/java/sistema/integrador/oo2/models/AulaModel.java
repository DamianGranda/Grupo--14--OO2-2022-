package sistema.integrador.oo2.models;

import sistema.integrador.oo2.entities.Edificio;

public abstract class AulaModel {

		protected int id;
		protected int numero;
		protected Edificio edificio;
		
		public AulaModel() {}
		
		public AulaModel(int numero, Edificio edificio) {
			super();
			this.numero = numero;
			this.edificio = edificio;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public Edificio getEdificio() {
			return edificio;
		}
		public void setEdificio(Edificio edificio) {
			this.edificio = edificio;
		}

		@Override
		public String toString() {
			return "Aula [id=" + id + ", numero=" + numero + ", edificio=" + edificio + "]";
		}
		
}
