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
}
