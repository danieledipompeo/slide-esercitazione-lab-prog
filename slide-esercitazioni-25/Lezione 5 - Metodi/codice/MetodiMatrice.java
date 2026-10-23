package it.univaq.disim.main;

public class MetodiMatrice {
	
	public static int[][] matriceIdentita(int n, int m) {
		int[][] a = new int[n][m];
		int p = 0;
		for (int i = 0; i < a.length && i <= p; i++) {
			if (i == p) {
				a[i][p] = 1;
				p++;
			}
		}
		return a;
	}

	public static int[][] trasponiMatrice(int[][] a) {
		// Se a è l'array è null o è vuoto non ritorno nulla
		if (a == null || a.length == 0) {
			return null;
		}

		// Salvo il numero di righe di a ed il numero di colonne
		int n = a.length;
		int m = a[0].length;

		// Creo una nuova matrice dove il numero di righe è uguale al numero di colonne
		// e viceversa
		int[][] b = new int[m][n];

		// Scorro la matrice e popolo gli elementi in modo trasposto
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}

	public static int[][] prodottoMatrici(int[][] a, int[][] b) {
		// Se a o b sono vuoti o se il numero di righe di a è diverso dal numero di
		// colonne di b non ritorno nulla
		if (a == null || b == null || a.length == 0 || b.length != a[0].length) {
			return null;
		}

		// Salvo il numero di righe di a ed il numero di colonne di a e b
		int righeA = a.length;
		int colonneA = a[0].length;
		int colonneB = b[0].length;

		// Creo una nuova matrice che ha il numero di righe di a ed il numero di colonne
		// di b
		int[][] c = new int[righeA][colonneB];

		// Scorro la nuova matrice
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				// Scorro le colonne di a
				for (int k = 0; k < colonneA; k++) {
					// Effettuo il prodotto righe per colonne
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	public static void stampaMatrice(int[][] a) {
		if (a == null) {
			System.out.println("La matrice in input è nulla");
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
	}

	public static boolean esercizioParziale(String[][] a, char[] c, int k) {
		for(int i = 0; i<a.length; i++) {
			boolean trovato = false;
			for(int j = 0; j<a[i].length && !trovato; j++) {
				if(a[i][j].charAt(0) == c[i] && a[i][j].length() < k) {
					trovato = true;
				}
			}
			if(!trovato) {
				return false;
			}
		}
		return true;
	}


}
