package it.unipd.mtss;

import java.util.List;

public class MEINN implements MEIN {
	@Override
	public double getOrderPrice(List<Articolo> itemsOrdered, Cliente user) throws BillException {

		if(itemsOrdered != null)
		{
			int length = itemsOrdered.size();
			
			if(length > 30)
			{
				throw new  BillException("Non è possibile ordinare più di 30 articoli.");
			}				
			else {
				int importo = 0;
				for(int i = 0; i < length; i++) {
					importo += itemsOrdered.get(i).prezzo;
				}
			}
		}
		else
		{
			
		}
		
		
		/* cambiare */
		return 0;
	}
}
