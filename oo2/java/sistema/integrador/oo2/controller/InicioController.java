package sistema.integrador.oo2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sistema.integrador.oo2.helpers.ViewRouteHelper;

@Controller
@RequestMapping("/")
public class InicioController {
	
	@GetMapping("/login")
	public String login(Model model, @RequestParam(name="perfil",required=false) String perfil) {
		//org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//perfil = (auth.getAuthorities().toString()).toUpperCase();
		// getAuthorities devuelve una coleccion, entonces devuelve [AUDITOR]
		// utilizo el substring para eliminar los []
		perfil = perfil.substring(1, perfil.length()-1);
		model.addAttribute("perfil", perfil);
		return ViewRouteHelper.LOGIN;
	}	
	
}