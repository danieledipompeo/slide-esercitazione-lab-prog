package it.univaq.disim.main;

public class BabboNatale {
	
	private String nome;
	private Regalo[] regali;
	
	public BabboNatale(String nome) {
		this.nome = nome;
	}
	
	public BabboNatale(String nome, Regalo[] regali) {
		this.nome = nome;
		this.regali = regali;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Regalo[] getRegali() {
		return regali;
	}
	
	public void setRegali(Regalo[] regali) {
		this.regali = regali;
	}
	
	public void stampaRegali() {
		for(int i = 0;i<this.regali.length; i++) {
			System.out.println(this.regali[i]);
		}
	}
	
	public boolean verificaRegalo(Regalo r) {
		for(int i = 0;i<this.regali.length; i++) {
			if(this.regali[i].equals(r)) {
				return true;
			}
		}
		return false;
	}
	
	public int contaRegaliDaConsegnare() {
		int conto = 0;
		for(int i=0;i<this.regali.length;i++) {
			if(!this.regali[i].isConsegnato()) {
				conto++;
			}
		}
		return conto;
	}
	
	public int contaRegaliDaConsegnare(String citta) {
		int conto = 0;
		for(int i=0;i<this.regali.length;i++) {
			if(!this.regali[i].isConsegnato() && this.regali[i].getCitta().equals(citta)) {
				conto++;
			}
		}
		return conto;
	}

}
