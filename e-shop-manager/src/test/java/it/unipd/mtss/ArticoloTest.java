/*////////////////////////////////////////////////////////////////////
// [Raul] [Seganfreddo] [1226293] 
// [Saad] [Mounib] [2052815] 
////////////////////////////////////////////////////////////////////*/
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class ArticoloTest {

	private Articolo articolo;

    @Before
    public void setUp()
    {
    	articolo = new Articolo("Tastiere",20);
    }
	
	@Test(expected = IllegalArgumentException.class)
	public void PrezzoNelCostruttoreNonNullo()
	{
		new Articolo("A",null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void NomeArticoloNelCostruttoreNonNullo()
	{
		new Articolo(null,10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getNome()
	{
		new Articolo("B",10);
	}
	
	@Test
	public void getPrezzo()
	{
		assertEquals(articolo.getPrezzo(),20);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void prezzoMaggioreDiZero()
	{
		new Articolo("A",-10);
	}
}
