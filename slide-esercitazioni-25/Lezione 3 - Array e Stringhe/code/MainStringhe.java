package it.univaq.disim.main;

import java.util.Scanner;

public class MainStringhe {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * Esercizio 1: Data una stringa, invertire l’ordine dei caratteri
		 */
		System.out.println("Esercizio 1: Data una stringa, invertire l’ordine dei caratteri");
		
		// Stringa in input
		String pippo = "pippo";
		
		// Dichiaro una nuova variabile di tipo stringa e la inizializzo alla stringa vuota
		String inv = "";
		
		// Scorro la stringa pippo al contrario
		for(int i = pippo.length()-1; i>=0; i--) {
			// Aggiungo ad inv il carattere in posizione i
			inv += pippo.charAt(i);
		}
		
		// Stampo il risultato
		System.out.println(inv);
		
		
		
		
		/*
		 * 
		 * 
		 * 
		 * Esercizio 2: Data una stringa, verificare se contiene almeno una vocale
		 */
		System.out.println("Esercizio 2: Data una stringa, verificare se contiene almeno una vocale");
		
		// Stringa in input
		String pluto = "pluto";
		
		// Dichiaro una variabile boolean di controllo
		boolean vocali = false;
		
		// Dichiaro un contatore per scorrere la stringa
		int c = 0;
		
		// Creo un ciclo while che scorre la stringa finchè non trova una vocale
		while(!vocali && c < pluto.length()) {
			// Verifico se il carattere in posizione c è una vocale
			if(pluto.charAt(c) == 'a' || pluto.charAt(c) == 'e' || pluto.charAt(c) == 'i'
					|| pluto.charAt(c) == 'o' || pluto.charAt(c) == 'u') {
				// Se il carattere è una vocale imposto il boolean a true 
				vocali = true;
			}else {
				// Altrimenti incremento il contatore e vado avanti nel ciclo
				c++;
			}
		}
		
		// Stampo il risultato
		if(vocali) {			
			System.out.println("La stringa ha almeno una vocale");
		}else {
			System.out.println("La stringa non ha vocali");
		}
		
		
		
		/*
		 * 
		 * Esercizio 3: Data una stringa, verificare se essa è palindroma (si può leggere sia da destra che da sinistra)
		 * 
		 * 
		 */
		
		System.out.println("Esercizio 3: Data una stringa, verificare se essa è palindroma (si può leggere sia da destra che da sinistra)");
		
		// Stringa in input
		String pal = "anna";
		
		// Creo una nuova stringa che è l'inverso della stringa data in input
		String inversa = "";
		for(int i =pal.length()-1; i>=0;i--) {
			inversa += pal.charAt(i);
		}
		
		// Verifico se le due stringhe sono uguali
		if(pal.equals(inversa)) {
			System.out.println("La stringa è palindroma");
		}else {
			System.out.println("La stringa non è palindroma");
		}
		
	}

}
