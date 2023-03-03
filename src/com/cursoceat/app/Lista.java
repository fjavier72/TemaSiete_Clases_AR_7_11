package com.cursoceat.app;

import java.util.Arrays;

public class Lista {
	private Integer[] tabla;

	public Lista() {
		this.tabla = new Integer[0];
	}
	
	public int getNumElementos() {
		return this.tabla.length;
	}
	
	public void insertarFinal(int numero) {
		this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + 1);
		this.tabla[this.tabla.length - 1] = numero;
	}
	
	public void insertarPrincipio(int numero) {
		Integer[] tablaAux = new Integer[this.tabla.length +1];
		System.arraycopy(this.tabla, 0, tablaAux, 1, this.tabla.length);
		tablaAux[0] = numero;
		this.tabla = tablaAux;
	}
	
	public void insertarDoneSea(int indice, int numero) {
		Integer[] tablaAux = new Integer[this.tabla.length +1];
		if (indice == 0)
			insertarPrincipio(numero);
		else if (indice == (this.tabla.length - 1))
			insertarFinal(numero);
		else if (indice > (this.tabla.length -1))
			System.err.println("La tabla no es tan grande\n");
		else {
			System.arraycopy(this.tabla, 0, tablaAux, 0, (indice));
			System.arraycopy(this.tabla, indice, tablaAux, (indice + 1), (this.tabla.length - indice));
			tablaAux[indice] = numero;
			this.tabla = tablaAux;
		}
	}
	
	public void addNewListFinal(Lista nuevaLista) {
		for (Integer numero : nuevaLista.tabla) {
			insertarFinal(numero);
		}
	}
	
	public void mostrarElementos() {
		for (Integer numero : this.tabla) {
			System.out.print(numero + " ");
		}
	}
}
