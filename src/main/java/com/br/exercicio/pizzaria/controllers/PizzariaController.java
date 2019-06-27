package com.br.exercicio.pizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.exercicio.pizzaria.models.PizzariaModel;
import com.br.exercicio.pizzaria.services.PizzariaService;

@Controller
public class PizzariaController {
	
	@Autowired
	private PizzariaService pizzariaService;
	
	@GetMapping
	public ModelAndView mostrarPizzar() {
		ModelAndView modelAndView = new ModelAndView("pizzaria.html");
		modelAndView.addObject("pizzas", pizzariaService.mostrarPizzas());
		return modelAndView;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView cadastrarPizza() {
		ModelAndView modelAndView = new ModelAndView("cadastro-de-pizzas.html");
		return modelAndView;
	}
		
	@PostMapping
	public String adicionarPizza(PizzariaModel pizzariaModel) {
		pizzariaService.adicionarPizza(pizzariaModel);
		return "redirect:/";
	}
	
	@GetMapping("/{sabor}")
	public ModelAndView buscarPizza(@PathVariable String sabor) {
		ModelAndView modelAndView = new ModelAndView("informacoes-pizza.html");
		modelAndView.addObject("pizzas", pizzariaService.buscarPizza(sabor));
		return modelAndView;
	}
	
}
