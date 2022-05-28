package sistema.integrador.oo2.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="curso")
public class Curso extends NotaPedido implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="cod_curso", nullable=true, length=45)
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
