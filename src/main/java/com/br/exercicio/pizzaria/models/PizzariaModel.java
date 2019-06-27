package com.br.exercicio.pizzaria.models;

public class PizzariaModel {
	
	private String sabor;
	private String massa;
	private String tipoDeBorda;
	private double valor;
	
	public PizzariaModel() {
		
	}
	
	public PizzariaModel(String sabor, String massa, String tipoDeBorda, double valor) {
		this.sabor = sabor;
		this.massa = massa;
		this.tipoDeBorda = tipoDeBorda;
		this.valor = valor;
	}

	public String getSabor() {
		return sabor;
	}

	public String getMassa() {
		return massa;
	}

	public String getTipoDeBorda() {
		return tipoDeBorda;
	}

	public double getValor() {
		return valor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public void setTipoDeBorda(String tipoDeBorda) {
		this.tipoDeBorda = tipoDeBorda;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("\nSabor: " + this.sabor);
		modelo.append("\nMassa: " + this.massa);
		modelo.append("\nTipo de borda: " + this.tipoDeBorda);
		modelo.append("\nValor: R$ " +this.valor);
		
		return modelo.toString();
	}

}
