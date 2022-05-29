package sistema.integrador.oo2.models;

import java.time.LocalDate; 



import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Materia;

public abstract class NotaPedidoModel {

	protected int id;
	protected LocalDate fecha;
	protected char turno;
	protected Aula aula;
	protected int cantEstudiantes;
	protected Materia materia;
	protected String observaciones;
	
	public NotaPedidoModel() {}
	
	public NotaPedidoModel(LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia,
			String observaciones) {
		super();
		this.fecha = fecha;
		this.turno = turno;
		this.aula = aula;
		this.cantEstudiantes = cantEstudiantes;
		this.materia = materia;
		this.observaciones = observaciones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public int getCantEstudiantes() {
		return cantEstudiantes;
	}

	public void setCantEstudiantes(int cantEstudiantes) {
		this.cantEstudiantes = cantEstudiantes;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "NotaPedidoModel [id=" + id + ", fecha=" + fecha + ", turno=" + turno + ", aula=" + aula
				+ ", cantEstudiantes=" + cantEstudiantes + ", materia=" + materia + ", observaciones=" + observaciones
				+ "]";
	}
	
}
