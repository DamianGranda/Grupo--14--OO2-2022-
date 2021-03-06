package sistema.integrador.oo2.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import sistema.integrador.oo2.entities.UserRole;
import sistema.integrador.oo2.helpers.ViewRouteHelper;
import sistema.integrador.oo2.services.IUserRoleService;

//ADMIN.....
 @Controller
public class UserRoleControllerCrud {
	
	@Autowired
	private IUserRoleService servicio;
	
	@GetMapping("/listar/roles")
	public String listarRoles(Model model) {
		model.addAttribute("userRoles", servicio.listar());
		return ViewRouteHelper.USERROLE_LISTAR;
	}
	
	@GetMapping("/listar/roles/nuevo")
	public String mostrarFormularioDeRegistrerUserRole(Model model) {
		UserRole userRole=new UserRole();
		model.addAttribute("userRole", userRole);
		return ViewRouteHelper.USERROLE_FORM;
	}
	@PostMapping("/listar/roles")
	public String guardarUserRole(@ModelAttribute("userRole") UserRole userRole) {
		servicio.guardarUserRole(userRole);
		return "redirect:/listar/roles";
	}
	@GetMapping("/listar/roles/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id,Model model) {
		model.addAttribute("userRole", servicio.obtenerUserRolePorId(id));
		return ViewRouteHelper.USERROLE_EDITAR;
	}
	
	@PostMapping("/listar/roles/{id}")
	public String actualizarUserRole(@PathVariable Long id, @ModelAttribute("userRole") UserRole userRole) {
		UserRole userRoleExistente=servicio.obtenerUserRolePorId(id);
		userRoleExistente.setId(id);
		userRoleExistente.setRole(userRole.getRole());
		userRoleExistente.setUpdatedAt(LocalDateTime.now());
		
		
		servicio.actualizarUserRole(userRoleExistente);
		return "redirect:/listar/roles";
	}
	
	@GetMapping("/listar/roles/{id}")
	public String eliminarUserRole(@PathVariable Long id) {
		servicio.eliminarUserRole(id);
		
		return "redirect:/listar/roles";
	}
	
	//Auditor....
	@GetMapping("/listarAuditor/roles")
	public String listarRolesAuditor(Model model) {
		model.addAttribute("userRoles", servicio.listar());
		return ViewRouteHelper.USERROLEAUDITOR_LISTAR;
	}
	
	
}
