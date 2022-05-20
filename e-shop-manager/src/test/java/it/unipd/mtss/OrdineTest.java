package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalTime;

public class OrdineTest {

	// controllo che nel costruttore l'ora sia < 24
	@Test(expected = IllegalArgumentException.class)
	public void testOrdineOraMinore() {
		new Ordine(24, 0);
	}

	// controllo che nel costruttore l'ora sia > -1
	@Test(expected = IllegalArgumentException.class)
	public void testOrdineOraMaggiore() {
		new Ordine(-1, 0);
	}

	// controllo che nel costruttore i minuti siano < 60
	@Test(expected = IllegalArgumentException.class)
	public void testOrdineMinutiMinore() {
		new Ordine(0, 60);
	}

	// controllo che nel costruttore i minuti siano > -1
	@Test(expected = IllegalArgumentException.class)
	public void testOrdineMinutiMaggiore() {
		new Ordine(0, -1);
	}
}