package sistema.integrador.oo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sistema.integrador.oo2.entities.User;
import sistema.integrador.oo2.helpers.ViewRouteHelper;
import sistema.integrador.oo2.services.IUserService;

@Controller
@RequestMapping
public class UserControllerCrud {
	@Autowired
	private IUserService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<User>users=service.listar();
		model.addAttribute("users", users);
		return ViewRouteHelper.USER_LISTAR;//tengo que poner el nnombre del archivo html
	}
}
