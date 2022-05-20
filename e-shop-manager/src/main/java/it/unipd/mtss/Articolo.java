/*////////////////////////////////////////////////////////////////////
// [Raul] [Seganfreddo] [1226293] 
// [Saad] [Mounib] [2052815] 
////////////////////////////////////////////////////////////////////*/ 


package it.unipd.mtss;

import java.time.*;

public class Articolo implements EItem{
	String nome;
	Integer prezzo;
	LocalTime orario;
	
	enum itemType {Processore,SchedeMadri, Mouse, Tastiere};
	
	public Articolo(String nome, Integer prezzo, LocalTime orario) {
		if(nome == null) {
			throw new IllegalArgumentException("Il nome non può essere nullo");
		}
		if(prezzo == null) {
			throw new IllegalArgumentException("Il prezzo non può essere nullo");
		}
		
		if(prezzo > 0) {
			this.prezzo = prezzo;
		}
		else
		{
			throw new IllegalArgumentException("Il prezzo deve essere maggiore di zero");
		}
		
		if(nome == "Processore" || nome == "SchedeMadri" || nome == "Mouse" || nome == "Tastiere") {
			this.nome = nome;
		}
		else
		{
			throw new IllegalArgumentException("Articolo non riconosciuto");
		}
		this.prezzo = prezzo;

		if(orario == null | orario.getHour() < 0 || orario.getHour() > 23 || orario.getMinute() < 0 || orario.getMinute() > 59) {
			throw new IllegalArgumentException("Orario non valido");
		}
	}
	public int getPrezzo() {
		return this.prezzo;
	}
	
	public String getNome() {
		return this.nome;
	}
}
