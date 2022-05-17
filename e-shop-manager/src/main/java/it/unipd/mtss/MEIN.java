package it.unipd.mtss;
import java.util.List;
import it.unipd.mtss.model.MenuItem;
import it.unipd.mtss.business.exception.BillException;


public interface MEIN {
	double getOrderPrice(List<EItem> itemsOrdered, User user) throws BillException;
	
	
	
}
