package sistema.integrador.oo2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.services.IEdificioService;

@Controller
public class EdificioControllerCrud {

	@Autowired
	private IEdificioService servicio;
	
	@GetMapping("/listar/edificio")
	public String listarEdificio(Model model) {
		model.addAttribute("edificio", servicio.listar());
		return "edificio/lista";
	}
	
	@GetMapping("/listar/edificio/nuevo")
	public String mostrarFormularioDeRegistrerEdificio(Model model) {
		Edificio edificio=new Edificio();
		model.addAttribute("edificio", edificio);
		return "edificio/form";
	}
	@PostMapping("/listar/edificios")
	public String guardarEdificio(@ModelAttribute("edificio") Edificio edificio) {
		servicio.guardarEdificio(edificio);
		return "redirect:/listar/edificios";
	}
	@GetMapping("/listar/edifio/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable int id,Model model) {
		model.addAttribute("edificio", servicio.obtenerEdificio(id));
		return "edificio/editar_edificio";//hacer el html de editar
	}
	
	@PostMapping("/listar/edificio/{id}")
	public String actualizarEdificio(@PathVariable int id, @ModelAttribute("edificio") Edificio edificio) {
		Edificio edificioExistente=servicio.obtenerEdificio(id);
		edificioExistente.setId(id);
		edificioExistente.setEdificio(edificio.getEdificio());
		edificioExistente.setAula(edificio.getAula());
		
		servicio.actualizarEdificio(edificioExistente);
		return "redirect:/listar/edificios";
	}
	
	@GetMapping("/listar/edificios/{id}")
	public String eliminarEdificio(@PathVariable int id) {
		servicio.eliminarEdificio(id);
		
		return "redirect:/listar/edificio";
	}
	@GetMapping("/aula/{id}")
	public String buscarPorIDYAulas(Edificio edificio,Model model) {
		
		model.addAttribute("edificio", servicio.buscarPorIDYAulas(edificio.getId()));
		return "edificio/edificio";
	}
	
}
