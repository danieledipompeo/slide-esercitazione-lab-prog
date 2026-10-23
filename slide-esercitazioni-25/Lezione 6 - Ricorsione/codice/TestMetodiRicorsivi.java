package it.univaq.disim.main;

public class TestMetodiRicorsivi {

	public static void main(String[] args) {
		int[][] a = {{7,3,-2,2,9},{5,0,8,2},{15,11,-2}};
		int[] b = {6,3,11};
		int k = 2;
		
		System.out.println(MetodiRicorsivi.secondoEsercizioRicorsivo(a, b, k));
		
		String[] s = {"dcba","k","","9qr","v3"};
		char[][] c = MetodiRicorsivi.esercizioQuattroRicorsivo(s);
		MetodiRicorsivi.stampaMatriceCaratteri(c);
	}

}
