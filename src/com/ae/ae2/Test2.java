package com.ae.ae2;

public  class Test2 implements Test {
	
	public void t1() {
		System.out.println("t1 method");
	}

	@Override //anootation -- 설명과 실행 
	public void t2() {
		System.out.println("t2 method");
	}

	@Override
	public void t3() {
		System.out.println("t3 method");		
	}

	@Override
	public void t4() {
		System.out.println("t4 method");		
	}


}
