package sistema.integrador.oo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import lombok.var;
import sistema.integrador.oo2.entities.Aula;
import sistema.integrador.oo2.entities.Edificio;
import sistema.integrador.oo2.entities.Laboratorio;
import sistema.integrador.oo2.entities.Tradicional;
import sistema.integrador.oo2.services.IAulaService;
import sistema.integrador.oo2.services.IEdificioService;
import sistema.integrador.oo2.services.implementation.AulaServiceimpl;
import sistema.integrador.oo2.services.implementation.EdificioServiceImpl;

@Controller
public class AulaControllerCrud {
	
	@Autowired
	private IAulaService serviceAula;
	
	//@Autowired
	//private EdificioServiceImpl servicioEdificio; Es IEdificioService
	//@Autowired
	//private IEdificioService  serviceEdificio;
	
	
	
	//@ModelAttribute("listEdificio")
	//public List<Edificio> listarEdificio(){
		//return serviceEdificio.listar();
	//}
	
	/*@GetMapping("/aula/({id}")
	public Aula obtenerAula( int id, Model model){// Trae el aula por id
		model.addAttribute("aula", serviceAula.obtenerAula(id));
	   return "";
	}*/
	
	// Trae a la clase por Id y devuelve dependiendo la instancia que sea
    @GetMapping("/traer/aula/{id}")
    public String traer(Aula aula, Model model) {// Relaciona el Id con el parametro classroom 
    	
        if(serviceAula.obtenerAula(aula.getId()) instanceof Tradicional)
        {
        	Tradicional tradicional=(Tradicional) serviceAula.obtenerAula(aula.getId());
            model.addAttribute("aula", tradicional);
            return "aula/tradicional";
        }
        
        Laboratorio laboratorio=(Laboratorio) serviceAula.obtenerAula(aula.getId());
        model.addAttribute("aula", laboratorio);
        return "aula/laboratorio";
    }
    
	@GetMapping("/listar/aula")
	public String listarAulas(Model model) {
		model.addAttribute("aula", serviceAula.listar());
		return "aula/lista";//hay que hacer este html
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
	
	
	/*@GetMapping("/editar/{id}") // Al pasarle el parametro {idClassroom} lo relaciona con el parametro de classroom
	public String editarAula(Aula aula, Model model)
	{		
	
		var verification = (var) servicioAula.obtenerAula(aula.getId()); // Para verificar la instancia
	
		// Necesario "instanciar" el objeto para ser mostrado en Thymeleaf
		if(verification instanceof Laboratorio)
		{
			model.addAttribute("laboratorio", (Laboratorio) verification);
			
			return "classroom/modifyLaboratory";//hacer el html de edit para laboratorio
		}
		
		model.addAttribute("tradicional", (Tradicional) verification);
		
		return "classroom/modifyTraditional"; ////hacer el html de edit para tradicional
	}
	*/
	// Trae a la clase por Id y devuelve dependiendo la instancia que sea
		/*@GetMapping("/aula/{id}")
		public String bringInstance(Aula aula, Model model) {// Relaciona el Id con el parametro classroom 
			

			var verification = (var) servicioAula.obtenerAula(aula.getId()); // Para verificar la instancia
			
			if(verification instanceof Tradicional)
			{
				model.addAttribute("classroom", (Tradicional) verification);			
				return "classroom/traditional";//hacer el html de lista tradicional
			}

			model.addAttribute("classroom", (Laboratorio) verification);
			return "classroom/laboratory";//hacer el html de lista laboraotrio
		}*/
		//hay que hacer los agregar, guardar y modificar de laboratori y tradicional
}