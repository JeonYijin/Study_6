package com.ae.ae6;

public class Aircon extends Electric{

	
	private int wide;

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}
	
	public void info() {
		super.info();
		System.out.println("Wide: "+ wide);
	}
	
	
}
