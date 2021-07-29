package com.ae.ae6;

public class S6Main {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		
		tv.setBrand("samsung");
		tv.setColor("black");
		tv.setPrice(1800000);
		tv.setPoint(1800);
		tv.setSize(70);
		
		Computer computer = new Computer();
		
		computer.setBrand("apple");
		computer.setColor("gray");
		computer.setPrice(1200000);
		computer.setPoint(1200);
		computer.setSsd(512);
		
		Aircon aircon = new Aircon();
		
		aircon.setBrand("samsung");
		aircon.setColor("white");
		aircon.setPrice(980000);
		aircon.setPoint(980);
		aircon.setWide(4);
		
		tv.info();
		computer.info();
		aircon.info();
		
		Guest iu = new Guest();
		iu.setMoney(5000000);
		iu.setPoint(10);
		
		//buy메서드 실행
		//게스트의 돈, 포인트 출력
		
		//iu.buy(tv);
		
		//System.out.println(iu.getMoney());
		//System.out.println(iu.getPoint());
		
		Electric[] e2 = new Electric[2];
		e2[0] = tv;
		e2[1] = computer;
		//e2[2] = aircon;
		
		iu.buy(e2);
		
		
		
	}

}
