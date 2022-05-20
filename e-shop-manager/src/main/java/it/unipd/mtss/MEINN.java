/*////////////////////////////////////////////////////////////////////
// [Raul] [Seganfreddo] [1226293] 
// [Saad] [Mounib] [2052815] 
////////////////////////////////////////////////////////////////////*/

package it.unipd.mtss;

import java.util.HashMap;
import java.util.List;

public class MEINN implements MEIN {
	public MEINN() {}
	
	@Override
	public double getOrderPrice(List<Articolo> itemsOrdered, Cliente user) throws BillException {
		double importo = 0.0;		
		if(itemsOrdered != null)
		{
			int length = itemsOrdered.size();
			
			if(length > 30)
			{
				throw new  BillException("Non è possibile ordinare più di 30 articoli.");
			}				
			else {
				int numeroProcessori = 0;
				int numeroMouse = 0;
				int numeroTastiere = 0;
				
				Double menoCaroTastiere = 0.0;
				Double menoCaroMouse = 0.0;
				Double menoCaroProcessori = 0.0;
				
				Articolo aux = null;
				for(int i = 0; i < itemsOrdered.size(); i++) {
					aux = itemsOrdered.get(i);
					
					if(aux.getNome() == "Processori") {
						numeroProcessori++;
						menoCaroProcessori = aux.getPrezzo();
					}
					
					if(aux.getNome() == "Mouse") {
						numeroMouse++;
						menoCaroMouse = aux.getPrezzo();
					}
					if(aux.getNome() == "Tastiere") {
						numeroTastiere++;
						menoCaroTastiere = aux.getPrezzo();
					}
					importo += aux.getPrezzo();
				}
				
				for(int j = 0; j < itemsOrdered.size(); j++) {
					aux = itemsOrdered.get(j);
					if(aux.getNome() == "Mouse") {
						if(aux.getPrezzo() < menoCaroMouse)
						{
							menoCaroMouse = aux.getPrezzo();
						}
					}
					
					if(aux.getNome() == "Tastiere") {
						if(aux.getPrezzo() < menoCaroTastiere)
						{
							menoCaroTastiere = aux.getPrezzo();
						}
					}

					if(aux.getNome() == "Processori") {
						if(aux.getPrezzo() < menoCaroProcessori)
						{
							menoCaroProcessori = aux.getPrezzo();
						}
					}
					
				}
				
				if(numeroProcessori > 5) {
					importo = importo - (menoCaroProcessori / 2);
				}
				
				if(numeroMouse > 10) {
					importo -= menoCaroMouse;
				}
				
				if(numeroTastiere == numeroMouse) {
					importo -= menoCaroMouse;
				}
				
				if(importo > 1000)
				{
					importo = (importo * 10) / 100;
				}
				
				if(importo < 10) {
					importo += 2;
				}
				
			}
		}
		else
		{
			throw new BillException("Lista vuota");
		}
		
		return importo;
	}
}
