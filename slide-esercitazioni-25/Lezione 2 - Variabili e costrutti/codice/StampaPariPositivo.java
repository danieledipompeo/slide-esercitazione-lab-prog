package it.univaq.disim.main;

public class StampaPariPositivo {

	public static void main(String[] args) {
		int x = -10;
		
		if(x % 2 == 0 && x > 0) {
			System.out.println("Positivo pari");
		}
		if(x % 2 != 0 && x > 0) {
			System.out.println("Positivo dispari");
		}
		if(x % 2 == 0 && x < 0) {
			System.out.println("Negativo pari");
		}
		if(x % 2 != 0 && x < 0) {
			System.out.println("Negativo dispari");
		}

	}

}
