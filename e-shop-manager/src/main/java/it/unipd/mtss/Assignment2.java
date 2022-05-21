////////////////////////////////////////////////////////////////////
// [Raul] [Seganfreddo] [1226293] 
// [Saad] [Mounib] [2052815] 
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.time.LocalTime;
import java.util.HashMap;

import it.unipd.mtss.Articolo.itemType;

public class Assignment2 {
public static void main(String [] args) {
		double valoreDaPagare = 0.0;
		
		HashMap<Cliente, Ordine> Ordini = new HashMap<Cliente, Ordine>();
		
		
		Cliente uno = new Cliente(20,"QQ", "rterc","Padova");
		Cliente due = new Cliente(20,"XX", "rterc","Padova");
		Cliente tre = new Cliente(20,"PP", "rterc","Padova");
		Cliente quattro = new Cliente(20,"SS", "rterc","Padova");
		Cliente cinque = new Cliente(20,"TT", "rterc","Padova");
		Cliente sei = new Cliente(20,"BB", "rterc","Padova");
		Cliente sette = new Cliente(20,"AA", "rterc","Padova");
		Cliente otto = new Cliente(20,"AS", "rterc","Padova");
		Cliente nove = new Cliente(20,"AV", "rterc","Padova");
		Cliente dieci = new Cliente(20,"AT", "rterc","Padova");
		
		Ordine o1 = new Ordine(12,30);
		o1.addArticolo("Processore", 10.0);
		o1.addArticolo("Processore", 10.0);
		o1.addArticolo("Processore", 10.0);
		o1.addArticolo("Processore", 10.0);
		o1.addArticolo("Processore", 10.0);
		o1.addArticolo("Processore", 10.0);
		
		o1.addArticolo("Tastiere", 1000.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		o1.addArticolo("Tastiere", 10.0);
		
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 5.0);
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 10.0);
		o1.addArticolo("Mouse", 10.0);
	
		Ordini.put(uno, o1);
		
		MEINN val = new MEINN();
		
	
		try
		{
		  valoreDaPagare = val.getOrderPrice(Ordini.get(uno).getLista(),uno);
		}
		catch(BillException e) {
			System.out.println("Erroe");
		}
		
	}
}
