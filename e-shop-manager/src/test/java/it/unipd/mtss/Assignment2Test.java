package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment2Test {

	// test run del main
	@Test
	public void testMain() {
		// Arrange
		String[] args = new String[1];
		args[0] = "test";
		// Act
		Assignment2.main(args);
	}

	@Test(expected = BillException.class)
	public void testLancioBillException() throws BillException {
		List<Articolo> itemsOrdered = null;
		Cliente user = new Cliente(16,"QQ", "rterc","Padova");
    	MEINN prova = new MEINN();
    	prova.getOrderPrice(itemsOrdered,user);
	}

	@Test(expected = BillException.class)
	public void testLancioBillException2() throws BillException {
		List<Articolo> itemsOrdered = new ArrayList<Articolo>();
		Cliente user = new Cliente(16,"QQ", "rterc","Padova");
    	MEINN prova = new MEINN();
    	for(int i = 0; i < 35; i++){
        	itemsOrdered.add(new Articolo("Tastiere", 10.00));
    	}
    	prova.getOrderPrice(itemsOrdered,user);
	}
}