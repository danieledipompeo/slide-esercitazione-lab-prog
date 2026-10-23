package it.univaq.disim.main;

public class Regalo {
	
	private String destinatario;
	private String descrizione;
	private String citta;
	private boolean consegnato;
	
	public Regalo(String destinatario, String descrizione, String citta) {
		this.destinatario = destinatario;
		this.descrizione = descrizione;
		this.citta = citta;
	}
	
	public String toString() {
		return "Regalo: "+descrizione+", Destinatario: "+destinatario+", Citta: "+citta;
	}
	
	public boolean equals(Regalo r) {
		return this.destinatario.equals(r.destinatario) &&
				this.descrizione.equals(r.descrizione) &&
				this.citta.equals(r.citta);
	}
	
	public boolean isConsegnato() {
		return consegnato;
	}
	
	public String getCitta() {
		return citta;
	}

}
