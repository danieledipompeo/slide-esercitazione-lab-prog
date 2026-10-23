package it.univaq.disim.main;

public class MetodiRicorsivi {

	// Versione iterativa del metodo
	public static boolean secondoEsercizio(int[][] a, int[] b, int k) {
		boolean risultato = true;
		int i = 0;
		while (i < a.length && risultato) {
			int j = 0;
			int conto = 0;
			boolean verificato = false;
			while (j < a[i].length && !verificato) {
				if (a[i][j] <= b[i]) {
					conto++;
				}
				if (conto >= k) {
					verificato = true;
				} else {
					j++;
				}
			}
			risultato = verificato;
			if (risultato) {
				i++;
			}
		}
		return risultato;
	}

	/*
	 *  Ricorsione in testa: dichiaro un metodo che prende in input gli stessi parametri del metodo iterativo.
	 *  All'interno del metodo chiamo un altro metodo con lo stesso nome, ma che prende in input 
	 *  una serie di parametri utili per la ricorsione, ma che non devono essere specificati dall'utente.
	 */
	public static boolean secondoEsercizioRicorsivo(int[][] a, int[] b, int k) {
		return secondoEsercizioRicorsivo(a, b, k, 0, 0, 0);
	}

	
	/*
	 * Metodo che implementa la ricorsione.
	 * Prende in input gli stessi parametri del metodo iterativo, più una serie di parametri utili per la ricorsione: 
	 * gli indici i e j per scorrere gli array ed una variabile conto per contare il numero di elementi <= b[i] 
	 */
	public static boolean secondoEsercizioRicorsivo(int[][] a, int[] b, int k, int i, int j, int conto) {
		/*
		 *  Caso base: se ho scorso tutto l'array vuol dire che tutte le righe soddisfano
		 *  la condizione, quindi posso ritornare true 
		 */
		if(i == a.length) return true;
		
		/*
		 * Se ho trovato almeno k elementi <=b[i] allora passo alla riga successiva richiamando 
		 * il metodo con i+=0, j=0 e conto=0
		 */
		if(conto >= k) return secondoEsercizioRicorsivo(a, b, k, i+=1, 0, 0);
		
		/*
		 * Secondo caso base: se ho scorso tutta una riga senza trovare almeno k elementi <= b[i]
		 * allora ritorno false perchè la riga non soddisfa la condizione
		 */
		if(j == a[i].length) return false;		
		
		/*
		 * Se nessuna delle condizioni è soddisfatta vuol dire che sto ancora scorrendo la riga,
		 * quindi controllo se a[i][j] <= b[i] e nel caso aumento conto.
		 * Infine richiamo il metodo aumentando j di 1, continuando ad esplorare la riga
		 */
		if(a[i][j] <= b[i]) {
			conto++;
		}
		return secondoEsercizioRicorsivo(a, b, k, i, j += 1, conto);

	}
	
	
	// Versione iterativa del metodo
	public static char[][] esercizioQuattro(String[] a){
		char[][] c = new char[a.length][];
		for(int i = 0; i<a.length; i++) {
			c[i] = new char[a[i].length()];
			for(int j = 0; j<a[i].length(); j++) {
				c[i][j] = a[i].charAt(j);
			}
		}
		return c;
	}
	
	/*
	 *  Metodo che implementa la ricorsione in testa.
	 *  In questo caso l'array multi-dimensionale c viene inizializzato all'invocazione
	 *  del metodo ricorsivo
	 */
	public static char[][] esercizioQuattroRicorsivo(String[] a){
		return esercizioQuattroRicorsivo(a, 0, 0, new char[a.length][]);
	}
	
	/*
	 * Metodo che implementa la ricorsione. 
	 * Prende in input gli stessi parametri del metodo iterativo più gli indici i e j per scorrere l'array e le stringhe
	 * e l'array multi-dimensionale c che ritorneremo in output
	 */
	public static char[][] esercizioQuattroRicorsivo(String[] a, int i, int j, char[][] c){
		/*
		 * Caso base: se ho scorso tutto l'array vuol dire che ho popolato tutto l'array bi-dimensionale c
		 */
		if(i == a.length) return c;
		
		/*
		 * Se sto iniziando a scorrere una stringa, 
		 * inizializzo il nuovo array in posizione c[i]
		 */
		if(j == 0) {
			c[i] = new char[a[i].length()];
		}
		
		/*
		 *  Se ho finito di scorrere la stringa, passo alla stringa successiva
		 *  richiamando il metodo con i=i+1 e j=0
		 */
		if(j == a[i].length()) {
			return esercizioQuattroRicorsivo(a, i += 1, 0, c);
		}
		
		/*
		 * Se sto ancora scorrendo un array, allora inserisco il carattere j in posizione
		 * c[i][j] e richiamo il metodo passando in input j = j+1
		 */
		c[i][j] = a[i].charAt(j);
		return esercizioQuattroRicorsivo(a, i, j += 1, c);
	}
	
	
	public static void stampaMatriceCaratteri(char[][] c) {
		for(int i = 0; i<c.length; i++) {
			for(int j = 0; j<c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
