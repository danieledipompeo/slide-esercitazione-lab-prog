package it.univaq.disim.main;

public class MainArray {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * 
		 * Esercizio 1: Dato un array di elementi interi, verificare se l’array contiene almeno un elemento pari
		 */
		
		System.out.println("Esercizio 1: Dato un array di elementi interi, verificare se l’array contiene almeno un elemento pari");
		// Dichiaro le variabili che mi servono
		int[] a = {1,3,4,2,5};
		int i = 0; // Scorre l'array
		boolean trovato = false; // Flag per il ciclo while
		
		// Scorro l'array finchè non trovo un elemento pari
		while(!trovato && i < a.length) {
			// Controllo se l'elemento in posizione i è pari con l'operatore %
			if(a[i]%2 == 0) {
				// Se l'elemento è pari imposto la variabile trovato a true
				trovato = true;
			}else {
				// Altrimenti incremento la variabile i ripeto il ciclo while
				i = i +1;
				//i += 1;
				//i++;
			}
		}
		
		// Stampo un messaggio se l'array contiene un numero pari o no
		if(trovato) {
			System.out.println("L'array contiene almeno un numero pari");
		}else {
			System.out.println("L'array non contiene almeno un numero pari");
		}
		
		
		
		/*
		 * 
		 * 
		 * 
		 * Esercizio 2: Dato un array di interi, trasformarlo in un array di Boolean 
		 * dove i numeri pari hanno valore true e i numeri dispari hanno valore false 
		 */
		
		System.out.println("Esercizio 2: Dato un array di interi, trasformarlo in un array di Boolean dove i numeri "
				+ "pari hanno valore true e i numeri dispari hanno valore false");
		
		int[] x = {1,3,4,2,5};
		
		// Creo un nuovo array di boolean della stessa lunghezza dell'array x
		boolean[] b = new boolean [x.length];
		
		// Scorro l'array x con un ciclo for
		for(int j = 0; j<x.length; j++) {
			// Controllo se l'elemento di x in posizione j è pari
			if(x[j]%2 == 0) {
				// Se è pari inserisco il valore true nell'array b in posizione j
				b[j] = true;
			}else {
				// Altrimenti inserisco il valore false
				b[j] = false;
			}
		}
		
		// Stampo gli elementi di b
		for(int j = 0; j<b.length; j++) {
			System.out.println(b[j]);
		}
		
		
		
		
		/*
		 * 
		 * 
		 * 
		 * Esercizio 3: Dato un array di interi, restituire il suo inverso
		 */
		System.out.println("Esercizio 3: Dato un array di interi, restituire il suo inverso");
		
		int[] y = {1,2,3,4,5};
		
		// Creo un nuovo array della stessa lunghezza di y
		int[] inv = new int [y.length];
		
		// Definisco una variabile per contare le posizioni di inv
		int pos = 0;
		
		// Creo un ciclo for che scorre l'array y al contrario
		for(int j = y.length-1; j>=0; j--) {
			// Assegno ad inv in posizione pos l'elemento di y in posizione j
			inv[pos] = y[j];
			
			// Incremento pos
			pos++;
		}
		
		// Stampo gli elementi di inv
		for(int j=0; j<inv.length; j++) {
			System.out.println(inv[j]);
		}
	}

}
