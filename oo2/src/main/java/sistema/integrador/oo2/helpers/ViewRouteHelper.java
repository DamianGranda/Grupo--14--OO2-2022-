package sistema.integrador.oo2.helpers;

public class ViewRouteHelper {
	
	public final static String INDEX = "inicio/index";
	
	public final static String LOGIN = "inicio/login";
	
	
	
	//USER-----
	public final static String USER_LOGIN = "user/login";
	public final static String USER_LOGOUT = "user/logout";
	public final static String USER_LISTAR = "user/lista";
	public final static String USER_VIEWADMIN = "user/ViewAdmin";
	public final static String USER_VIEWAUDITOR = "user/ViewAuditor";
	public final static String USER_FORM = "user/form";
	public final static String USER_EDITAR = "user/editar_user";
	public final static String USERAUDITOR_LISTAR = "user/listaAuditor";
	
	public final static String ADMINISTRADOR_ROOT = "admin/mostrar";
	public final static String AUDITOR_ROOT = "auditor/mostrarAuditor";

	//USERROLE-----
	public final static String USERROLE_LISTAR = "userRole/lista";
	public final static String USERROLE_FORM = "userRole/form";
	public final static String USERROLE_EDITAR = "userRole/editar_userRole";
	public final static String USERROLEAUDITOR_LISTAR = "userRole/listaAuditor";
	
	//EDIFICIO----
	
	public final static String EDIFICIO_LISTA = "edificio/lista";
	public final static String EDIFICIO_FORM = "edificio/form";
	public final static String EDIFICIO_EDITAR = "edificio/editar_edificio";
	public final static String EDIFICIO_AULAS = "edificio/aulaDeEdificio";
	public final static String EDIFICIOAUDITOR_LISTAR = "edificio/listaAuditorEdificio";
	
	//AULA----
	public final static String AULA_LISTA = "aula/lista";
	public final static String AULA_LABORATORIO = "aula/laboratorio";
	public final static String AULA_TRADICIONAL = "aula/tradicional";
	public final static String AULA_TRADICIONALAUDITOR = "aula/tradicionalAuditor";
	public final static String AULA_LABORATORIOAUDITOR = "aula/laboratorioAuditor";
	public final static String AULA_LISTAAUDITOR = "aula/listaAuditor";
	
	//CARRERA-----
	public final static String CARRERA_LISTA = "carrera/lista";
	public final static String CARRERA_EDITAR = "carrera/editar";
	public final static String CARRERA_FORM = "carrera/form";
	public final static String CARRERA_LISTAAUDITOR = "carrera/listaAuditor";
	
	//DEPARTAMENTO-----
	public final static String DEPARTAMENTO_LISTA = "departamento/lista";
	public final static String DEPARTAMENTO_FORM = "departamento/form";
	public final static String DEPARTAMENTO_EDITAR = "departamento/editar";
	public final static String DEPARTAMENTO_LISTAAUDITOR = "departamento/listaAuditor";
	
	//ESPACIO----------------
	public final static String ESPACIO_FORM = "espacio/form";
	public final static String ESPACIO_EDITAR = "espacio/editar_espacio";
	public final static String ESPACIO_MOSTRAR = "espacio/mostrar";
	public final static String ESPACIO_MOSTRARAUDITOR = "espacio/mostrarAuditor";
	
	//MATERIA---------
	public final static String MATERIA_FORM = "materia/form";
	public final static String MATERIA_EDITAR = "materia/editar_materia";
	public final static String MATERIA_MOSTRAR = "materia/mostrar";
	public final static String MATERIA_MOSTRARAUDITOR = "materia/mostrarAuditor";
	
	//NOTAPEDIDO---------
	public final static String NOTAPEDIDO_CURSO = "notapedido/crearCurso";
	public final static String NOTAPEDIDO_FINAL = "notapedido/crearFinal";
	public final static String NOTAPEDIDO_MOSTRAR = "notapedido/mostrar";
	public final static String NOTAPEDIDO_MOSTRARAUDITOR = "notapedido/mostrarAuditor";
	public final static String NOTAPEDIDO_EDITARCURSO = "notapedido/editar_notaPedido_curso";
	public final static String NOTAPEDIDO_EDITARFINAL = "notapedido/editar_notaPedido_final";
}
