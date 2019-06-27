package com.br.exercicio.pizzaria.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.br.exercicio.pizzaria.models.PizzariaModel;

@Service
public class PizzariaService {
	
	private Map<Integer, PizzariaModel> pizzas = new HashMap<Integer, PizzariaModel>() {
		{
			put(1, new PizzariaModel("Pepperoni", "Nova-iorquina", "Tradicional", 34.50));
			put(2, new PizzariaModel("Mussarela", "Tradicional", "Catupiry", 29.90));
			put(3, new PizzariaModel("Portuguesa", "Siciliana", "Tradicional", 32.00));
		}
	};
	
	public Collection<PizzariaModel> mostrarPizzas() {
		return this.pizzas.values();
	}
	
	public void adicionarPizza(PizzariaModel pizzariaModel) {
		pizzas.put(pizzas.size()+1, pizzariaModel);
	}
	
	public PizzariaModel buscarPizza(String sabor) {
		PizzariaModel informacao = null;
		
		for (PizzariaModel pizza : pizzas.values()) {
			if(pizza.getSabor().equalsIgnoreCase(sabor)) {
				informacao = pizza;
			}
		}
		return informacao;
	}
	
}
