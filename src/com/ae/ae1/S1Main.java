package com.ae.ae1;

public class S1Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tablet tablet = new Tablet();

		computer.setBrand("Imac");
		phone.setBrand("Apple");
		tablet.setBrand("samsung");
		
		computer.info();
		phone.info();
		tablet.info();
		
		computer.info2();
	}

}
