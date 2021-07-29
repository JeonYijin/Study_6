package com.ae.ae6;

public class Tv  extends Electric {
	
	private int size;
	
//	public Tv() {
//		super("samsung");
//	}
//	
//	public Tv() {//super클래스의 멤버변수를 확장시키는것
//		//super();//생략가능	
//	}
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void info() {
		super.info();
		System.out.println("Size: "+ this.size);
	}
	
	

}
