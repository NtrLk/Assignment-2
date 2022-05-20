package it.unipd.mtss;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class Ordine {
	private List<Articolo> ArticoliOrdinati;
	LocalTime ora;

	public Ordine(LocalTime ora) {
		new ArrayList<Articolo>();
		// controllo che l'ora non sia nulla e che sia un ora valida
		if (ora == null || ora.getHour() < 0 || ora.getHour() > 23 || ora.getMinute() < 0 || ora.getMinute() > 59) {
			throw new IllegalArgumentException("ora non valida");
		}
		this.ora = ora;
	}
	
	public void addOrdine(String nome,Double prezzo) {
		ArticoliOrdinati.add(new Articolo(nome,prezzo));
	}

	// CONTROLLI
	public List<Articolo> getLista()
	{
		return ArticoliOrdinati;
	}

	public String getOrario() {
		int ore;
		int minuti;
		ore = ora.getHour();
		minuti = ora.getMinute();
		String oraString = Integer.toString(ore) + "-" + Integer.toString(minuti);
		return oraString;
	}
}
