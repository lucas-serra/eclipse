package com.lucas.java;

public class TesteEnum {
	public static void main(String[] args) {
		
		DiaSemanaClasseEnum dia = DiaSemanaClasseEnum.DOMINGO;
		
		System.out.println(dia.toString()+" - "+dia.getValor());
	}
}
