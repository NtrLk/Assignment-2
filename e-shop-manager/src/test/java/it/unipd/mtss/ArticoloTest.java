/*////////////////////////////////////////////////////////////////////
// [Raul] [Seganfreddo] [1226293] 
// [Saad] [Mounib] [2052815] 
////////////////////////////////////////////////////////////////////*/
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.time.*;



public class ArticoloTest {

	private Articolo articolo;

    @Before
    public void setUp()
    {
    	articolo = new Articolo("Tastiere",20,LocalTime.of(12,0));
    }
	
	@Test(expected = IllegalArgumentException.class)
	public void PrezzoNelCostruttoreNonNullo()
	{
		new Articolo("A",null,LocalTime.of(12,0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void NomeArticoloNelCostruttoreNonNullo()
	{
		new Articolo(null,10,LocalTime.of(12,0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getNome()
	{
		new Articolo("B",10,LocalTime.of(12,0));
	}
	
	@Test
	public void getPrezzo()
	{
		assertEquals(articolo.getPrezzo(),20);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void prezzoMaggioreDiZero()
	{
		new Articolo("A",-10,LocalTime.of(12,0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void orarioNonNullo()
	{
		new Articolo("A",10,null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void orarioOreNonValide()
	{
		new Articolo("A",10,LocalTime.of(24,0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void orarioMinutiNonValidi()
	{
		new Articolo("A",10,LocalTime.of(12,60));
	}
}