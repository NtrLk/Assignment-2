package it.unipd.mtss;

import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Ordine {
	private List<Articolo> ArticoliOrdinati;
	LocalTime ora;

	public Ordine(LocalTime ora) {
		 new ArrayList<Articolo>();
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
		String oraString = ore + "-" + minuti;
		return oraString;
	}
}
