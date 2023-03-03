package com.cursoceat.controller;

import com.cursoceat.app.Lista;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista1 = new Lista();
		System.err.println("<Lista 1>");
		System.out.println("Insertando elementos al final...");
		lista1.insertarFinal(2);
		lista1.mostrarElementos();
		System.out.println();
		lista1.insertarFinal(3);
		lista1.mostrarElementos();
		System.out.println();
		lista1.insertarFinal(5);
		lista1.mostrarElementos();
		System.out.println();
		lista1.insertarFinal(6);
		lista1.mostrarElementos();
		System.out.println();
		System.out.println("Insertando elemento al principio...");
		lista1.insertarPrincipio(1);
		lista1.mostrarElementos();
		System.out.println();
		System.out.println("\nLista 1 con el número '4' insertado en la posición de indice '3'");
		lista1.insertarDondeSea(3, 4);
		lista1.mostrarElementos();
		System.out.println();
		
		Lista lista2 = new Lista();
		for (int i = 7; i < 10; i++)
			lista2.insertarFinal(i);
		System.err.println("\n<Lista 2>");
		lista2.mostrarElementos();
		System.out.println();

		System.out.println("\nLista 1 con los elementos de Lista 2 al final");
		lista1.addNewListFinal(lista2);
		lista1.mostrarElementos();
		System.out.println();
		
		System.out.println("\nLista 1 con el elemento situado en la posición indice '3' eliminado");
		lista1.eliminarElemento(3);
		lista1.mostrarElementos();
		System.out.println();
		
		System.out.println("\nSe obtiene el elemento situado en la posición indice '5' de Lista 1");
		lista1.obtenerElemento(5);
		
		System.out.println("\nSe busca el número '8' en la tabla y devuelve la posición de la primera coincidencia que encuentre");
		lista1.mostrarElementos();
		System.out.println("\nLa primera coincidencia del número buscado está en la posición " + lista1.buscarNumero(8));
		System.out.println("\nInsertamos otro número '8' para poder comprobar el método 'buscarNumero()' teniendo número repetidos");
		lista1.insertarDondeSea(3, 8);
		lista1.mostrarElementos();
		System.out.println("\nY volvemos a buscar la primera coincidencia del número '8'...");
		System.out.println("La primera coincidencia del número buscado está en la posición " + lista1.buscarNumero(8));
		System.out.println("\nAhora vamos a buscar un número que no esté en la tabla, p.e., '12'. Debería devolver '-1'...");
		lista1.mostrarElementos();
		System.out.println("\nLa primera coincidencia del número buscado está en la posición " + lista1.buscarNumero(12));
		
		System.out.println("\nVolvemos a insertar el número '4' en su sitio, sustituyendo al primer '8' y...");
		lista1.eliminarElemento(3);
		lista1.insertarDondeSea(3, 4);
		System.out.println("Mostramos finalmente los elementos de la lista por consola");
		lista1.mostrarElementos();
		
		System.err.println("\n\n* * * * F I N A L   D E L   E J E R C I C I O * * * *");
		
	}

}
