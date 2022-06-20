package sistema.integrador.oo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.var;
import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.entities.Laboratorio;
import sistema.integrador.oo2.entities.Tradicional;
import sistema.integrador.oo2.helpers.ViewRouteHelper;
import sistema.integrador.oo2.services.IAulaService;
import sistema.integrador.oo2.services.IEdificioService;
import sistema.integrador.oo2.services.implementation.AulaServiceimpl;
import sistema.integrador.oo2.services.implementation.EdificioServiceImpl;

@Controller
public class AulaControllerCrud {
	
	@Autowired
	private IAulaService serviceAula;
	
	
	
    @GetMapping("/traer/aula/{id}")
    public String traer(Aula aula, Model model) { 
    	
        if(serviceAula.obtenerAula(aula.getId()) instanceof Tradicional)
        {
        	Tradicional tradicional=(Tradicional) serviceAula.obtenerAula(aula.getId());
            model.addAttribute("aula", tradicional);
            return ViewRouteHelper.AULA_TRADICIONAL;
        }
        
        Laboratorio laboratorio=(Laboratorio) serviceAula.obtenerAula(aula.getId());
        model.addAttribute("aula", laboratorio);
        return ViewRouteHelper.AULA_LABORATORIO;
    }
    
    @GetMapping("/listar/aula")
	public ModelAndView listar_admin() {
		ModelAndView mAV = new ModelAndView("aula/lista");
		mAV.addObject("lstLaboratorios", serviceAula.getAllLaboratorio());
		mAV.addObject("lstTradicionales", serviceAula.getAllTradicional());
		return mAV;
	}
	
	@PostMapping("/listar/aula")
	public String guardarEdificio(@ModelAttribute("aula") Aula aula) {
		//servicioAula.guardarAula(aula);
		serviceAula.guardarAula(aula);
		return "redirect:/listar/aula";
	}
	
	@GetMapping("/listar/aula/{id}")
	public String eliminarEdificio(@PathVariable int id) {
		serviceAula.eliminarAula(id);
		
		return "redirect:/listar/aula";
	}
	
	
}