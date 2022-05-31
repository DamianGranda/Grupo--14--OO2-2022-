package sistema.integrador.oo2.controller;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import sistema.integrador.oo2.converters.PerfilConverters;
import sistema.integrador.oo2.helpers.ViewRouteHelper;
import sistema.integrador.oo2.services.IPerfilService;
import sistema.integrador.oo2.services.IUsuarioService;


@Controller
@RequestMapping("/")
public class UsuarioController {

	@Autowired
	@Qualifier("usuarioService")
	private IUsuarioService usuarioService;
	
	@Autowired
	@Qualifier("perfilService")
	private IPerfilService perfilService;
	
	@Autowired
	@Qualifier("perfilConverter")
	private PerfilConverters perfilConverter;
	


	// ---------------------LOG IN------------------------------
		@GetMapping("/login")
		public String login(Model model,
							@RequestParam(name="error",required=false) String error,
							@RequestParam(name="logout", required=false) String logout) {
			model.addAttribute("error", error);
			model.addAttribute("logout", logout);
			return ViewRouteHelper.USUARIO_LOGIN;
		}
		
		@GetMapping("/logout")
		public String logout(HttpServletRequest request, HttpServletResponse response) {
		    org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    if (auth != null){    
		        new SecurityContextLogoutHandler().logout(request, response, auth);
		    }
		    return ViewRouteHelper.USUARIO_LOGOUT;
		}
		
		@GetMapping("/loginsuccess")
		public RedirectView loginCheck() {
			org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String perfil = (auth.getAuthorities().toString()).toUpperCase();
			String ruta = "/";
			if(perfil.contains("AUDITOR")) ruta = ViewRouteHelper.AUDITOR_ROOT;
			if(perfil.contains("ADMINISTRADOR")) ruta = ViewRouteHelper.ADMINISTRADOR_ROOT;
			return new RedirectView(ruta);
		}
}
