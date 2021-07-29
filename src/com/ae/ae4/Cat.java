package com.ae.ae4;

public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("냐용냐옹");
	}

	public void drop() {
		System.out.println("물건 떨구기");
	}
}
