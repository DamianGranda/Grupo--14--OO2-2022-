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
	@Column(name="cod_curso", nullable=true, length=45)
	private String codCurso;
	
	public Curso() {}
	
	
	public Curso(int id, LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia,
			String observaciones, boolean estado, String codCurso) {
		super(id, fecha, turno, aula, cantEstudiantes, materia, observaciones, estado);
		this.codCurso = codCurso;
	}
	//hago constructor para pasar en el controller y setear el estado
	






	public String getCodCurso() {
		return codCurso;
	}

	public Curso(int id, LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia,
			String observaciones, boolean estado) {
		super(id, fecha, turno, aula, cantEstudiantes, materia, observaciones, estado);
		// TODO Auto-generated constructor stub
	}


	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	@Override
	public String toString() {
		return "Curso [codCurso=" + codCurso + "]";
	}
	
	
}
