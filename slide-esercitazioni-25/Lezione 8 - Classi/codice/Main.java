package it.univaq.disim.main;

import it.univaq.disim.domain.BabboNatale;
import it.univaq.disim.domain.Regalo;

public class Main {

	public static void main(String[] args) {
		BabboNatale b = new BabboNatale("Santa Claus");
		Regalo[] regali = {
				new Regalo("Mario Rossi", "PS 5", "Roma"),
				new Regalo("Enzo Bianchi", "Iphone 15", "Milano")
		};
		BabboNatale b2 = new BabboNatale("Babbo Natale", regali);
		
		System.out.println(b.getNome());
		b.setNome("Pippo Baudo");
		System.out.println(b.getNome());
		System.out.println(b2.getNome());
		//System.out.println(b2.getRegali());
		
		b2.stampaRegali();
		System.out.println(b2.contaRegaliDaConsegnare());
		System.out.println(b2.contaRegaliDaConsegnare("Roma"));
	}

}
