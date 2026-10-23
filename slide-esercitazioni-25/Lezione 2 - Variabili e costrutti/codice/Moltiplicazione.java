package it.univaq.disim.main;

public class Moltiplicazione {

	public static void main(String[] args) {
		
		// Versione con ciclo while
		
		System.out.println("---------- Ciclo while ----------");
		
		int a = 3;
		int b = 3;
			
		int risultato = 0;
		
		while(b > 0) {
			risultato = risultato + a;
			b--;
		}
		
		System.out.println(risultato);

		// Versione con ciclo for
		
		System.out.println("---------- Ciclo for ----------");
		
		int x = 3;
		int y = 3;
			
		int ris = 0;
		
		for(int i = 0; i < y; i++) {
			ris = ris + x;
		}
		
		System.out.println(ris);
		
	}

}
