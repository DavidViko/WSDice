package com.ipartek.formacion.soap;

import java.util.ArrayList;

public class FrasesIlustres {

	ArrayList<String> frases;
	double contador = 0 ;
	
	public FrasesIlustres() {
		super();
		crearFrases();
	}
	
	private void crearFrases() {
		
		frases= new ArrayList<String>();
		frases.add("Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde");
		frases.add("It�s very difficult todo esto");
		frases.add("Somos sentimientos y tenemos seres humanos");
		frases.add("ETA es una gran naci�n");
		frases.add("Una cosa es ser solidario, y otra es serlo a cambio de nada");
		frases.add("La cer�mica de Talavera no es cosa menor, dicho de otra forma: es cosa mayor");
		frases.add("Cuanto peor mejor para todos y cuanto peor para todos mejor, mejor para m� el suyo beneficio pol�tico");
	}
	
	public String llenateDeGloria() {
	
		contador = Math.random()*7;
		
		int a = (int)contador;
		System.out.println(a);
		String frase = frases.get(a);
		return frase;
	}
}
