package it.univaq.disim.main;

public class TestMatrici {
	
	public static void main(String[] args) {
		int[][] a = MetodiMatrice.matriceIdentita(2, 2);
		MetodiMatrice.stampaMatrice(a);
		
		System.out.println("----------------");
		
		int[][] b = {{1,2,3}, {4,5,6}};
		int[][] c = MetodiMatrice.trasponiMatrice(b);
		MetodiMatrice.stampaMatrice(c);
		
		System.out.println("----------------");
		
		int[][] d = {{1,0,2},{0, 3, -1}};
		int[][] e = {{4,1},{-2,2},{0,3}};
		
		int[][] prod = MetodiMatrice.prodottoMatrici(d, e);
		MetodiMatrice.stampaMatrice(prod);

		System.out.println("-------------------");

		String[][] a = {{"abc","bb","d"},{"rkr","rc"},{"mp", "aqsfg","ats","ar"}};
		char[] c = {'b','r','a'};

		System.out.println(MetodiMatrice.esercizioParziale(a, c, 4));

	}

}
