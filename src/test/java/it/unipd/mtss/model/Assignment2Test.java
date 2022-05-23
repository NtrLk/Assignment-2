package it.unipd.mtss.model;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import it.unipd.mtss.model.Articolo;
import it.unipd.mtss.model.Ordine;
import it.unipd.mtss.model.Cliente;
import it.unipd.mtss.business.BillImpl;
import it.unipd.mtss.business.exeption.BillException;


public class Assignment2Test {
	
	// test run del main
	@Test
	public void testMain() {
		// Arrange
		String[] args = new String[1];
		args[0] = "test";
		// Act
		Assignment2.main(args);
		
		Assignment2 D = new Assignment2();
		assertTrue(D.c == 0);
	}

	@Test(expected = BillException.class)
	public void testLancioBillException() throws BillException {
		List<Articolo> itemsOrdered = null;
		Cliente user = new Cliente(16,"QQ", "rterc","Padova");
    	BillImpl prova = new BillImpl();
    	prova.getOrderPrice(itemsOrdered,user);
	}
		
	@Test
	public void testLancioBillException2() {
		List<Articolo> itemsOrdered = new ArrayList<Articolo>();
		Cliente user = new Cliente(16,"QQ", "rterc","Padova");
    	BillImpl prova = new BillImpl();
      
    	for(int i = 0; i < 35; i++){
        	itemsOrdered.add(new Articolo("Tastiere", 10.00));
    	}
    	
    	try {
    		prova.getOrderPrice(itemsOrdered,user);
    	}
    	catch(BillException e) {
    		assertEquals(e.getMessage(), new BillException("Non e' possibile ordinare piu' di 30 articoli.").getMessage());
    	}
    	
    	
    	
    	
	}
}