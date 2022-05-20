/*////////////////////////////////////////////////////////////////////
// [Raul] [Seganfreddo] [1226293] 
// [Saad] [Mounib] [2052815] 
////////////////////////////////////////////////////////////////////*/
package it.unipd.mtss;
import java.util.List;

public interface MEIN {
	double getOrderPrice(List<Articolo> itemsOrdered, Cliente user) throws BillException;
}
