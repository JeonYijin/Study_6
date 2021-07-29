package com.ae.ae6;

public class Guest {
	
	private int money;
	private int point;
	
	//물건의 가격과 물건의 포인트받기 
	//매개변수는 1개만 선언 가능
	public void buy(Electric e) {
		this.money = this.money - e.getPrice();
		this.point = this.point + e.getPoint();
		
		//System.out.println(this.money);
		//System.out.println(this.point);
	}
	//여러 개를 샀을 때 계산하는 메서드
	//매개변수 하나만 선언
	
	public void buy(Electric [] e) { //배열의 개수만큼 물건 구입
		
		for(int i=0; i<e.length; i++) {
			this.money = this.money - e[i].getPrice();
			this.point = this.point + e[i].getPoint();
		}
		
		System.out.println(this.money);
		System.out.println(this.point);
		
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
