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
	
	//AULA----
	public final static String AULA_LISTA = "aula/lista";
	public final static String AULA_LABORATORIO = "aula/laboratorio";
	public final static String AULA_TRADICIONAL = "aula/tradicional";
}
