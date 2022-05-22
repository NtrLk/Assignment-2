package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

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
}
