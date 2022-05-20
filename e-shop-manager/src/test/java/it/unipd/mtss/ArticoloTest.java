/*////////////////////////////////////////////////////////////////////
// [Raul] [Seganfreddo] [1226293] 
// [Saad] [Mounib] [2052815] 
////////////////////////////////////////////////////////////////////*/
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ArticoloTest {

	Articolo articolo;
	Articolo articoloDue;
    @Before
    public void setUp()
    {
    	articolo = new Articolo(" ",0);
    	articoloDue = new Articolo("A",100);
    }
	
	@Test
	public void getPrezzo()
	{
		assertEquals(100,articolo.getPrezzo());
	}
	
	@Test
	public void getNome()
	{
		

		assertEquals("A",articolo.getNome());
	}
	
	@Test
	public void notNullNome()
	{
		
			
		assertNotNull(articolo.getNome());
	}
	
	@Test
	public void notNullPrezzo()
	{
		
			
		assertNotNull(articolo.getPrezzo());
	}
	
	@Test
	public void prezzoMaggioreDiZero()
	{
		Articolo articolo = new Articolo(" ",-5);
			
		
	}
	
	
}
