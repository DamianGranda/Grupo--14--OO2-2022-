package sistema.integrador.oo2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

		return "redirect:/login";
		}
	
	
	//public String logout(Model model) {
		//return ViewRouteHelper.USER_LOGOUT;
	//}
	
	@GetMapping("/loginsuccess")
	public String loginCheck() {
		return "redirect:/inicio/index";
	}
}
