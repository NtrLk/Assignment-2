package it.unipd.mtss;
import java.util.List;

public interface MEIN {
	double getOrderPrice(List<Articolo> itemsOrdered, Cliente user) throws BillException;
}
