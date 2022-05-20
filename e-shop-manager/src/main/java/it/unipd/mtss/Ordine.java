package it.unipd.mtss;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
	private List<Articolo> ArticoliOrdinati;

	public Ordine() {
		 new ArrayList<Articolo>();
	}
	
	public void addOrdine(String nome,Double prezzo) {
		// orario
		ArticoliOrdinati.add(new Articolo(nome,prezzo));
	}

	// CONTROLLI
	public List<Articolo> getLista()
	{
		return ArticoliOrdinati;
	}
}
