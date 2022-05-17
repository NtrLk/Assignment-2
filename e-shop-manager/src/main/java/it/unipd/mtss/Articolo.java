package it.unipd.mtss;

public class Articolo implements EItem{
	String nome;
	int prezzo;
	enum itemType {Processore,SchedeMadri, Mouse, Tastiere};
	
	public Articolo(String nome, int prezzo) {
		if(nome != null) {
			if(nome.length() > 0 && prezzo > 0)
			{
				this.nome = nome;
				this.prezzo = prezzo;
			}
			else
			{
				System.out.println("I prezzi non possono essere minori o uguali a zero | un articolo deve avere un nome");
			}
		}
		else
		{
			System.out.println("Un articolo deve avere un nome");
		}
	}
	public int getPrezzo() {
		return this.prezzo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	/* Test getter / test costruttore  */
	
	
}
