////////////////////////////////////////////////////////////////////
// [Raul] [Seganfreddo] [1226293] 
// [Saad] [Mounib] [2052815] 
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.ArrayList;
import java.util.List;

import it.unipd.mtss.Articolo.itemType;

import java.time.DateTimeException;
import java.time.LocalTime;

public class Ordine {
	private List<Articolo> ArticoliOrdinati;
	private Integer ora;
	private Integer minuti;

	public Ordine(Integer ora, Integer minuti) {
		this.ArticoliOrdinati = new ArrayList<Articolo>();
		// controllo che nel costruttore l'ora sia valida
		if (ora < 0 || ora > 23) {
			throw new IllegalArgumentException("ora non valida");
		}
		else {
			this.ora = ora;
		}

		// controllo che nel costruttore i minuti siano validi
		if (minuti < 0 || minuti > 59) {
			throw new IllegalArgumentException("minuti non validi");
		}
		else {
			this.minuti = minuti;
		}
	}
	
	public void addArticolo(String nome,Double prezzo) {
		if (nome == null || prezzo == null || prezzo < 0) {
			throw new IllegalArgumentException("nome o prezzo non validi");
		}
		ArticoliOrdinati.add(new Articolo(nome,prezzo));
	}

	// CONTROLLI
	public List<Articolo> getLista()
	{
		return ArticoliOrdinati;
	}

	public String getOrario() {
		return ora + ":" + minuti;
	}
}
