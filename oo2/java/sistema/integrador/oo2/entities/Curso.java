package sistema.integrador.oo2.entities;

import java.io.Serializable;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;



@Entity
@Table(name="curso")
public class Curso extends NotaPedido implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	
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
