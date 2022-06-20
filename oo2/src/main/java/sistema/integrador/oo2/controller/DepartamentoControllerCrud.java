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

import sistema.integrador.oo2.entities.Departamento;
import sistema.integrador.oo2.helpers.ViewRouteHelper;
import sistema.integrador.oo2.services.IDepartamentoService;


@Controller
@RequestMapping("/departamento")
public class DepartamentoControllerCrud {
	
		@Autowired
		private IDepartamentoService departamentoService;
		
		
		@GetMapping("/admin/listar")
		public ModelAndView listar() {
			ModelAndView mAV = new ModelAndView(ViewRouteHelper.DEPARTAMENTO_LISTA);
			mAV.addObject("lstDepartamentos", departamentoService.listar());
			mAV.addObject("departamento", new Departamento());
			return mAV;
		}
		
		@GetMapping("/auditor/listar")
		public ModelAndView listarAuditor() {
			ModelAndView mAV = new ModelAndView(ViewRouteHelper.DEPARTAMENTO_LISTAAUDITOR);
			mAV.addObject("lstDepartamentos", departamentoService.listar());
			mAV.addObject("departamento", new Departamento());
			return mAV;
		}
		
		@GetMapping("/nuevo/agregar") 
		public ModelAndView newCreate() { 
			ModelAndView mAV = new ModelAndView(ViewRouteHelper.DEPARTAMENTO_FORM);
			mAV.addObject("lstDepartamentos", departamentoService.listar());
			mAV.addObject("departamento", new Departamento());
			return mAV;
		}
		@PostMapping("/crear")
		public RedirectView create_dep(@ModelAttribute("departamento") Departamento departamento, RedirectAttributes redirectAttributes) {
			departamentoService.insertOrUpdate(departamento);
			redirectAttributes.addFlashAttribute("departamento_agreagdo", true);
			return new RedirectView("/departamento/admin/listar");
		}
		
		
		@GetMapping("/editar/{id}") // GET DE EDITAR
		public ModelAndView editar_d(@PathVariable("id") int id) {
			ModelAndView mAV = new ModelAndView(ViewRouteHelper.DEPARTAMENTO_EDITAR);
			mAV.addObject("departamento", departamentoService.findById(id));
			mAV.addObject("lstDepartamento", departamentoService.listar());//ATENCION!
			return mAV;
		} 
		@PostMapping("/edit") //POST DE EDITAR
		public RedirectView edit_suss(@ModelAttribute("departamento") Departamento departamento, RedirectAttributes redirectAttributes) {
				departamentoService.insertOrUpdate(departamento);
				redirectAttributes.addFlashAttribute("departamento_editado", true);
		
			return new RedirectView("/departamento/admin/listar");
		}
		
		@GetMapping("/eliminar/{id}") //ELIMINA CON GET, NO ME FUNCIONA CON POST
		public RedirectView eliminar(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
			departamentoService.remove(id);
			redirectAttributes.addFlashAttribute("departamento_borrado", true);
			return new RedirectView("/departamento/admin/listar");
		}


}
