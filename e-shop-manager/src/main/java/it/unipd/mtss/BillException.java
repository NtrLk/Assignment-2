package it.unipd.mtss;

public class BillException extends Exception{
		public BillException() {System.out.println("Non è possibile ordinare più di 30 articoli.");}
}
