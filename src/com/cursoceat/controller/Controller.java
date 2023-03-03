package com.cursoceat.controller;

import com.cursoceat.app.Lista;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista1 = new Lista();
		System.out.println("Lista 1");
		lista1.insertarFinal(2);
		lista1.insertarFinal(3);
		lista1.insertarFinal(5);
		lista1.insertarFinal(6);
		lista1.insertarPrincipio(1);
		lista1.mostrarElementos();
		System.out.println("\n");
		System.out.println("Lista 1 con el número '4' insertado en la posición de indice '3'");
		lista1.insertarDoneSea(3, 4);
		lista1.mostrarElementos();
		System.out.println("\n");
		
		Lista lista2 = new Lista();
		for (int i = 7; i < 10; i++)
			lista2.insertarFinal(i);
		System.out.println("Lista 2");
		lista2.mostrarElementos();
		System.out.println("\n");

		System.out.println("Lista 1 con los elementos de Lista 2 al final");
		lista1.addNewListFinal(lista2);
		lista1.mostrarElementos();
	}

}
