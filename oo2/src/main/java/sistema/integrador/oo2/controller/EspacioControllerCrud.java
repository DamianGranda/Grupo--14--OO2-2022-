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

import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.entities.Espacio;
import sistema.integrador.oo2.services.IAulaService;
import sistema.integrador.oo2.services.IEdificioService;
import sistema.integrador.oo2.services.IEspacioService;



@Controller
@RequestMapping("/espacio")
public class EspacioControllerCrud {

	@Autowired
	
	private IEspacioService espacioService;
	
	@Autowired
	
	private IAulaService aulaService;
	
	@Autowired
	private IEdificioService edificioService;
	
	@GetMapping("/admin/listar")
	public ModelAndView listar() {

		ModelAndView mAV = new ModelAndView("espacio/mostrar");
		mAV.addObject("lstEspacios", espacioService.listar());
		mAV.addObject("espacio", new Espacio());
		//mAV.addObject("edificio", new Edificio());
		return mAV;
	}
	@GetMapping("/nuevo/agregar") 
	public ModelAndView newCreate(Edificio edificio) {
		ModelAndView mAV = new ModelAndView("espacio/form");
		mAV.addObject("lstAulas", aulaService.listar());
		mAV.addObject("espacio", new Espacio());
		mAV.addObject("lstEdificio",edificioService.listar());
		
		mAV.addObject("edificio", edificioService.buscarPorIDYAulas(edificio.getId()));
		return mAV;
	}
	@PostMapping("/crear") // CU 4
	public RedirectView create_es(@ModelAttribute("espacio") Espacio espacio, RedirectAttributes redirectAttributes) {
		try {
			espacioService.agregar(espacio.getFecha(), espacio.getTurno(), espacio.getAula(), espacio.isLibre());
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("ya_existe", true);
			e.printStackTrace();
		}
		redirectAttributes.addFlashAttribute("edificio_agreagdo", true);
		return new RedirectView("/espacio/admin/listar");
	}
	
	@GetMapping("/editar/{id}") 
	public ModelAndView editar_e(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView("espacio/editar_espacio");
		mAV.addObject("espacio", espacioService.findById(id));
		mAV.addObject("lstAulas", aulaService.listar());
		return mAV;
	} 
	@PostMapping("/edit") 
	public RedirectView edit_suss(@ModelAttribute("espacio") Espacio espacio, RedirectAttributes redirectAttributes) {
		espacioService.insertOrUpdate(espacio);
		redirectAttributes.addFlashAttribute("espacio_editado", true);
		return new RedirectView("/espacio/admin/listar");
	}
	
	@GetMapping("/eliminar/{id}") 
	public RedirectView eliminar(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		espacioService.remove(id);
		redirectAttributes.addFlashAttribute("edificio_borrado", true);
		return new RedirectView("/espacio/admin/listar");
	}
}
