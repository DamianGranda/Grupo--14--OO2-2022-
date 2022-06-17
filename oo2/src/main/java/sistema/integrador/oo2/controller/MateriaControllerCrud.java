package sistema.integrador.oo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


import sistema.integrador.oo2.entities.Materia;
import sistema.integrador.oo2.services.implementation.CarreraServiceImpl;
import sistema.integrador.oo2.services.implementation.MateriaServiceImpl;

@Controller
@RequestMapping("/materia")
public class MateriaControllerCrud {
	
	@Autowired
	public MateriaServiceImpl service;
	
	@Autowired
	public CarreraServiceImpl carreraService;
	
	
	@GetMapping("/admin/listar")
	public ModelAndView listar() {
		ModelAndView mAV = new ModelAndView("/materia/mostrar");
		mAV.addObject("lstMaterias", service.listar());
		mAV.addObject("materia", new Materia());

		return mAV;
	}
	
	@GetMapping("/editar/{id}") 
	public ModelAndView editar_e(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView("materia/editar_materia");
		mAV.addObject("materia", service.findById(id));
		mAV.addObject("lstCarreras", carreraService.listar());
		return mAV;
	} 
	
	@PostMapping("/edit") 
	public RedirectView edit_suss(@ModelAttribute("materia") Materia materia, RedirectAttributes redirectAttributes) {
		service.insertOrUpdate(materia);
		redirectAttributes.addFlashAttribute("materia_editada", true);
		return new RedirectView("/materia/admin/listar");
	}
	
	@GetMapping("/eliminar/{id}") 
	public RedirectView eliminar(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		service.remove(id);
		redirectAttributes.addFlashAttribute("materia_borrada", true);
		return new RedirectView("/materia/admin/listar");
	}
}
