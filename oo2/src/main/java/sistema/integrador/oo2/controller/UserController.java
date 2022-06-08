package sistema.integrador.oo2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import sistema.integrador.oo2.helpers.ViewRouteHelper;


@Controller
public class UserController {

	@GetMapping("/login")
	public String login(Model model,
						@RequestParam(name="error",required=false) String error,
						@RequestParam(name="logout", required=false) String logout) {
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		return ViewRouteHelper.USER_LOGIN;
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request){

		SecurityContextLogoutHandler logoutHandler =
		new SecurityContextLogoutHandler();

		logoutHandler.logout(request, null, null);

		return ViewRouteHelper.USER_LOGOUT;
		}
	
	
	//public String logout(Model model) {
		//return ViewRouteHelper.USER_LOGOUT;
	//}
	
	@GetMapping("/loginsuccess")
	public RedirectView loginCheck() {
		org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String rol = (auth.getAuthorities().toString()).toUpperCase();
		String ruta = "/";
		if(rol.contains("ROLE_AUDITOR")) ruta = ViewRouteHelper.AUDITOR_ROOT;
		if(rol.contains("ROLE_ADMIN")) ruta = ViewRouteHelper.ADMINISTRADOR_ROOT;
		return new RedirectView(ruta);
	}
}
