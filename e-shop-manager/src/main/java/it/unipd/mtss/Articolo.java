package it.unipd.mtss;

public class Articolo implements EItem{
	String nome;
	Integer prezzo;
	enum itemType {Processore,SchedeMadri, Mouse, Tastiere};
	
	public Articolo(String nome, Integer prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}
	public int getPrezzo() {
		return this.prezzo;
	}
	
	public String getNome() {
		return this.nome;
	}
}
