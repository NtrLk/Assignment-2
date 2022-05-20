package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class ArticoloTest {

	private Articolo articolo;

    @Before
    public void setUp()
    {
    	articolo = new Articolo("Tastiere",20.0);
    }
	
	@Test(expected = IllegalArgumentException.class)
	public void PrezzoNelCostruttoreNonNullo()
	{
		new Articolo("A",null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void NomeArticoloNelCostruttoreNonNullo()
	{
		new Articolo(null,10.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getNome()
	{
		new Articolo("B",10.0);
	}
	
	@Test
	public void getPrezzo()
	{
		Double x = 20.0;
		assertEquals(articolo.getPrezzo(),x);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void prezzoMaggioreDiZero()
	{
		new Articolo("A",-10.0);
	}
}
