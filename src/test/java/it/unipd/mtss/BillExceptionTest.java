package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class BillExceptionTest {

	@Test
	public void testBillException() {
		BillException billException = new BillException("test");
		assertEquals("test", billException.getMessage());
	}
}
