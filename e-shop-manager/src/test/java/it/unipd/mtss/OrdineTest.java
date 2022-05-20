package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalTime;

public class OrdineTest {

	@Test(expected = IllegalArgumentException.class)
	public void oraNulla() {
		new Ordine(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void oraNonValida() {
		new Ordine(LocalTime.of(24, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void minutiNonValidi() {
		new Ordine(LocalTime.of(0, 60));
	}

	@Test(expected = IllegalArgumentException.class)
	public void nomeNullo() {
		new Ordine(LocalTime.of(0, 0)).addOrdine(null, 0.0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void prezzoNullo() {
		new Ordine(LocalTime.of(0, 0)).addOrdine("", null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void prezzoNegativo() {
		new Ordine(LocalTime.of(0, 0)).addOrdine("", -1.0);
	}
}