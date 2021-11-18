package com.lucas.java;

public enum DiaSemanaClasseEnum {
	SEGUNDA(1), TERCA(2), QUARTA(3),QUINTA(4), SEXTA(5), SABADO(6),DOMINGO(7);
	
	private int valor;

	DiaSemanaClasseEnum(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
