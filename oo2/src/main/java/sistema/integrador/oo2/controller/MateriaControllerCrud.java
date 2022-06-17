package sistema.integrador.oo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sistema.integrador.oo2.entities.Materia;
import sistema.integrador.oo2.services.implementation.MateriaServiceImpl;

@Controller
@RequestMapping("/materia")
public class MateriaControllerCrud {
	
	@Autowired
	public MateriaServiceImpl service;
	
	@GetMapping("/admin/listar")
	public ModelAndView listar() {
		ModelAndView mAV = new ModelAndView("/materia/mostrar");
		mAV.addObject("lstMaterias", service.listar());
		mAV.addObject("materia", new Materia());

		return mAV;
	}
	
	
}
