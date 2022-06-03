package sistema.integrador.oo2.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import sistema.integrador.oo2.entities.UserRole;
import sistema.integrador.oo2.services.IUserRoleService;

public class UserRoleControllerCrud {
	
	@Autowired
	private IUserRoleService servicio;
	
	@GetMapping("/listar/roles")
	public String listarRoles(Model model) {
		model.addAttribute("userRoles", servicio.listar());
		return "userRole/lista";
	}
	
	@GetMapping("/listar/roles/nuevo")
	public String mostrarFormularioDeRegistrerUserRole(Model model) {
		UserRole userRole=new UserRole();
		model.addAttribute("userRole", userRole);
		return "userRole/form";//hacer el html de form
	}
	@PostMapping("/listar/roles")
	public String guardarUserRole(@ModelAttribute("userRole") UserRole userRole) {
		servicio.guardarUserRole(userRole);
		return "redirect:/listar/roles";
	}
	@GetMapping("/listar/roles/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id,Model model) {
		model.addAttribute("userRole", servicio.obtenerUserRolePorId(id));
		return "userRole/editar_userRole";
	}
	
	@PostMapping("/listar/roles/{id}")
	public String actualizarUserRole(@PathVariable Long id, @ModelAttribute("userRole") UserRole userRole) {
		UserRole userRoleExistente=servicio.obtenerUserRolePorId(id);
		userRoleExistente.setId(id);
		userRoleExistente.setRole(userRole.getRole());
		userRoleExistente.setUpdatedAt(LocalDateTime.now());
		userRoleExistente.setUser(userRole.getUser());//revisar bien este
		
		servicio.actualizarUserRole(userRoleExistente);
		return "redirect:/listar/roles";
	}
	
	@GetMapping("/listar/roles/{id}")
	public String eliminarUserRole(@PathVariable Long id) {
		servicio.eliminarUserRole(id);
		
		return "redirect:/listar/roles";
	}
	
	
	
}