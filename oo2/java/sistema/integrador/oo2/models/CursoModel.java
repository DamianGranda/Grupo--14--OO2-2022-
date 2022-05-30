package sistema.integrador.oo2.models;

import java.time.LocalDate;


import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Materia;

public class CursoModel extends NotaPedidoModel {
	
	protected int id;
	private String codCurso;
	
	public CursoModel() {}
	
	public CursoModel(LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia, String observaciones,
			String codCurso) {
		super(fecha, turno, aula, cantEstudiantes, materia, observaciones);
		this.codCurso = codCurso;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	@Override
	public String toString() {
		return "CursoModel [id=" + id + ", codCurso=" + codCurso + "]";
	}
	
	
	
}
