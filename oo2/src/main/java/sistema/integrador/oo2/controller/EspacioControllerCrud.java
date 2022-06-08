package sistema.integrador.oo2.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.entities.Espacio;
import sistema.integrador.oo2.services.IEspacioService;

@Controller
public class EspacioControllerCrud {
	
	@Autowired
	private IEspacioService servicio;
	
	
	@GetMapping("/listar/espacio")
	public String listarEspacio(Model model) {
		model.addAttribute("espacio", servicio.listar());
		return "espacio/form";
	}
	
	@GetMapping("/listar/espacio/nuevo")
	public String mostrarFormularioDeRegistrerEspacio(Model model) {
	
		Espacio espacio =new Espacio();
		model.addAttribute("espacio", espacio);
		
	
        
		return "espacio/form";
	}
	@PostMapping("/listar/espacio")
	public String guardarEspacio(@ModelAttribute("espacio") Espacio espacio) {
		servicio.guardarEspacio(espacio);
		return "redirect:/listar/espacio";
	}
	@GetMapping("/listar/espacio/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable int id,Model model) {
		model.addAttribute("espacio", servicio.obtenerEspacio(id));
		return "espacio/editar_espacio";//hacer el html de editar
	}
	
	@PostMapping("/listar/espacio/{id}")
	public String actualizarEspacio(@PathVariable int id, @ModelAttribute("espacio") Espacio espacio) {
		Espacio espacioExistente=servicio.obtenerEspacio(id);
		espacioExistente.setId(id);
		espacioExistente.setFecha(espacio.getFecha());
		espacioExistente.setAula(espacio.getAula());
		espacioExistente.setTurno(espacio.getTurno());
		espacioExistente.setLibre(espacio.isLibre());
		
		servicio.actualizarEspacio(espacioExistente);
		return "redirect:/listar/espacio";
	}
	
	@GetMapping("/listar/espacio/{id}")
	public String eliminarEspacio(@PathVariable int id) {
		servicio.eliminarEspacio(id);
		
		return "redirect:/listar/espacio";
	}
	
	@GetMapping("/listar/espacio/{fecha}?{turno}")
	public Espacio buscarPorFechaTurnoAula(LocalDate fecha, char turno, Aula aula) {
		return servicio.buscarPorFechaTurnoAula(fecha, turno, aula); 
	}
	
	/*
	@PostMapping("")
	public int agregarPorFechaTurnoAula(LocalDate fecha, char turno, Aula aula, boolean libre) {
		return repositorio.agregarPorFechaTurnoAulaLibre(fecha, turno, aula, libre);
	}
	*/
}
