package sistema.integrador.oo2.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
	
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
	public String guardarU(@ModelAttribute("user") User user) {
		user.setPassword(pe.encode(user.getPassword()));
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
		userExistente.setApellido(user.getApellido());
		userExistente.setNombre(user.getNombre());
		userExistente.setDocumento(user.getDocumento());
		userExistente.setTipo_doc(user.getTipo_doc());
		userExistente.setEmail(user.getEmail());
		userExistente.setUsername(user.getUsername());
		userExistente.setPassword(pe.encode(user.getPassword()));
		userExistente.setEnabled(user.isEnabled());
		userExistente.setUpdatedAt(LocalDateTime.now());
		userExistente.setRol(user.getRol());

		servicio.actualizarUser(userExistente);
		return "redirect:/listar";
	}

	@GetMapping("/listar/{id}")
	public String eliminarUser(@PathVariable Long id) {
		servicio.eliminarUser(id);
		return "redirect:/listar";

	}
}
