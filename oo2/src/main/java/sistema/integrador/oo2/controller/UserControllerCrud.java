package sistema.integrador.oo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import sistema.integrador.oo2.entities.User;
import sistema.integrador.oo2.services.IUserService;

@Controller
public class UserControllerCrud {

	@Autowired
	private IUserService servicio;

	@GetMapping("/listar")
	public String listarUsers(Model model) {
		model.addAttribute("users", servicio.listar());
		return "user/lista";
	}

	@GetMapping("/listar/nuevo")
	public String mostrarFormularioDeRegistrarUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "user/form";
	}

	@PostMapping("/listar")
	public String guardarEstudiante(@ModelAttribute("user") User user) {
		servicio.guardarUser(user);
		return "redirect:/listar";
	}

	@GetMapping("/listar/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id,Model model) {
		model.addAttribute("user", servicio.obtenerUserPorId(id));
		return "user/editar_user";
	}

	@PostMapping("/listar/{id}")
	public String actualizarUser(@PathVariable Long id, @ModelAttribute("user") User user) {
		User userExistente = servicio.obtenerUserPorId(id);
		userExistente.setId(id);
		userExistente.setUsername(user.getUsername());
		userExistente.setPassword(user.getPassword());
		userExistente.setEnabled(user.isEnabled());
		userExistente.setCreatedAt(user.getCreatedAt());
		userExistente.setUpdatedAt(user.getUpdatedAt());
		//userExistente.setUserRoles(user.getUserRoles());// lo comento pórque todavia no hice lo de los roles

		servicio.actualizarUser(userExistente);
		return "redirect:/listar";
	}

	@GetMapping("/listar/{id}")
	public String eliminarUser(@PathVariable Long id) {
		servicio.eliminarUser(id);
		return "redirect:/listar";

	}
}
