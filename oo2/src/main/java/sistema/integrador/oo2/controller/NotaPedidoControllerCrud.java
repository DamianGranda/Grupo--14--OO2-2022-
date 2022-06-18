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

import sistema.integrador.oo2.entities.NotaPedido;
import sistema.integrador.oo2.services.INotaPedidoService;

@Controller
@RequestMapping("/pedido")
public class NotaPedidoControllerCrud {
	
	@Autowired
	private INotaPedidoService notaPedidoService;
	
	@GetMapping("/admin/listar")
	public ModelAndView listar() {
		ModelAndView mAV = new ModelAndView("/notapedido/mostrar");
		mAV.addObject("lstPedidos", notaPedidoService.listar());
		return mAV;
	}
}
