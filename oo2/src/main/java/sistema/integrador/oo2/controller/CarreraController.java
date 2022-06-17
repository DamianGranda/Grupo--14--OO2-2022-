package sistema.integrador.oo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import sistema.integrador.oo2.entities.Carrera;
import sistema.integrador.oo2.helpers.ViewRouteHelper;
import sistema.integrador.oo2.services.ICarreraService;
import sistema.integrador.oo2.services.IDepartamentoService;

@Controller
@RequestMapping("/carrera")
public class CarreraController {
	@Autowired
	
	private ICarreraService carreraService;
	
	@Autowired
	
	private IDepartamentoService departamentoService;
	
	@GetMapping("/admin/listar") 
	public ModelAndView listar() {
		ModelAndView mAV = new ModelAndView("carrera/lista");
		mAV.addObject("lstCarrera", carreraService.listar());
		mAV.addObject("carrera", new Carrera());
		return mAV;
	}
	
	@GetMapping("/nuevo/agregar") 
	public ModelAndView newCreate() { 
		ModelAndView mAV = new ModelAndView("carrera/form");
		mAV.addObject("lstCarrera", carreraService.listar());
		mAV.addObject("lstDepartamento", departamentoService.listar());
		mAV.addObject("carrera", new Carrera());
		return mAV;
	}
	@PostMapping("/crear")
	public RedirectView create_dep(@ModelAttribute("carrera") Carrera carrera, RedirectAttributes redirectAttributes) {
		carreraService.insertOrUpdate(carrera);
		redirectAttributes.addFlashAttribute("carrera_agreagdo", true);
		return new RedirectView("/carrera/admin/listar");
	}
	
	@GetMapping("/editar/{id}") 
	public ModelAndView editar_e(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView("carrera/editar");
		mAV.addObject("carrera", carreraService.findById(id));
		mAV.addObject("lstDepartamento", departamentoService.listar());
		return mAV;
	} 
	@PostMapping("/edit") 
	public RedirectView edit_suss(@ModelAttribute("carrera") Carrera carrera, RedirectAttributes redirectAttributes) {
		carreraService.insertOrUpdate(carrera);
		redirectAttributes.addFlashAttribute("carrera_editado", true);
		return new RedirectView("/carrera/admin/listar");
	}
	
	@GetMapping("/eliminar/{id}") 
	public RedirectView eliminar(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		carreraService.remove(id);
		redirectAttributes.addFlashAttribute("carrera_borrado", true);
		return new RedirectView("/carrera/admin/listar");
	}
	

}
