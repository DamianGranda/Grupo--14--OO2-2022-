package sistema.integrador.oo2.model;

import java.time.LocalDate;

public class Curso extends NotaPedido {
	
	private String codCurso;
	
	public Curso() {}
	public Curso(LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia, String observaciones,
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
	
}
