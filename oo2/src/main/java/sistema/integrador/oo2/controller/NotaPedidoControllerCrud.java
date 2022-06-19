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

import sistema.integrador.oo2.entities.Curso;
import sistema.integrador.oo2.entities.Final;
import sistema.integrador.oo2.entities.NotaPedido;
import sistema.integrador.oo2.services.IAulaService;
import sistema.integrador.oo2.services.IMateriaService;
import sistema.integrador.oo2.services.INotaPedidoService;

@Controller
@RequestMapping("/notaPedido")
public class NotaPedidoControllerCrud {
	
	@Autowired
	private INotaPedidoService notaPedidoService;
	
	@Autowired
	private IAulaService aulaService;
	
	@Autowired
	private IMateriaService materiaService;
	
	
	
	
	
	/*@Autowired
	private IFinal*/
	@GetMapping("/admin/listar")
	public ModelAndView listar() {
		ModelAndView mAV = new ModelAndView("/notapedido/mostrar");
		mAV.addObject("lstPedidos", notaPedidoService.listar());
		return mAV;
	}
	// NOTA PEDIDO PARA CREAR UN FINAL:
	@GetMapping("/nuevo/final")
	public ModelAndView create_final() {
		ModelAndView mAV =new ModelAndView("notapedido/crearFinal");
		mAV.addObject("final", new Final());
		mAV.addObject("lstAulas", aulaService.listar());
		mAV.addObject("lstMaterias", materiaService.listar());
		return mAV;
	}
	@PostMapping("/final/crear")
	public RedirectView create_sussces_final_a(@ModelAttribute("final") Final finall, RedirectAttributes redirectAttributes){
		notaPedidoService.insertOrUpdate(finall);
		redirectAttributes.addFlashAttribute("final_bien", true);
		return new RedirectView("/notaPedido/admin/listar");
	}
	//NOTA PEDIDO PARA CREAR UN CURSO
		@GetMapping("/nuevo/curso")
		public ModelAndView create_curso() {
			ModelAndView mAV =new ModelAndView("notapedido/crearCurso");
			mAV.addObject("curso", new Curso());
			mAV.addObject("lstAulas", aulaService.listar());
			mAV.addObject("lstMaterias", materiaService.listar());
			return mAV;
		}
		@PostMapping("/curso/crear")
		public RedirectView create_sussces_curso_a(@ModelAttribute("curso") Curso curso, RedirectAttributes redirectAttributes){
			notaPedidoService.insertOrUpdate(curso);
			redirectAttributes.addFlashAttribute("curso_bien", true);
			return new RedirectView("/notaPedido/admin/listar");
		}
		@GetMapping("/estado/deshabilitar/{id}")
		public RedirectView deshabPerfil_admin(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
			RedirectView RV = new RedirectView("/notaPedido/admin/listar", true);
			NotaPedido notaPedido = notaPedidoService.findById(id);
			notaPedido.setEstado(false);
			notaPedidoService.insertOrUpdate(notaPedido);
			return RV;
		}

		@GetMapping("/estado/habilitar/{id}")
		public RedirectView habPerfil_admin(@PathVariable("id") int id) {
			RedirectView RV = new RedirectView("/notaPedido/admin/listar", true);
			NotaPedido notaPedido = notaPedidoService.findById(id);
			notaPedido.setEstado(true);
			notaPedidoService.insertOrUpdate(notaPedido);
			return RV;
		}
		
}
