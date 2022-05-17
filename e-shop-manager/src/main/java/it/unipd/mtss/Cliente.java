package it.unipd.mtss;

public class Cliente implements User{
	int age;
	String nome;
	String cognome;
	String luogoNascita;
	
	public Cliente(int age, String nome, String cognome, String luogoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.luogoNascita = luogoNascita;
		this.age = age;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getCognome() {
		return this.cognome;
	}
	public String getLuogoNascita() {
		return this.luogoNascita;
	}
	public int getAge() {
		return this.age;
	}
}