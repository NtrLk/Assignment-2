package it.unipd.mtss;

public class Articolo implements EItem{
	String nome;
	int prezzo;
	
	public Articolo(String nome, int prezzo) {
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
