package com.ae.ae4;

public class S4Main {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		tiger.sound();
		tiger.wash();
		
		cat.sound();
		cat.drop();
		
		dog.sound();
		dog.guard();
		
		//case
		//모을려고 하는 데이터타입[] 변수명;
		// Tiger is a Animal
		//Tiger타입은 Animal 타입이다
		
		Animal animal = tiger;//자식 타입을 부모타입으로 바꿔주는 것이 다형성(reference타입의 형변환)
		//Cat타입은 Animal타입이다
		animal = cat;
		animal = dog;
		
		
		Animal[] animals = new Animal[3]; 
		
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = dog;
		
		for(int i =0; i<animals.length; i++) {
			animals[i].sound();
			
		}
		
		System.out.println("=======================================");
		
		Animal a = animals[1];
		
		System.out.println(a instanceof Tiger);
		System.out.println("========================================");
		
		Tiger t2 = new Tiger();
		Animal a2 = t2;
		
		
		Animal animal2 = new Animal(); //animal2 에 해당하는 것이 자식타입
		Tiger tiger2 = (Tiger)animal2;
		tiger2.sound();
		tiger2.wash();
		
		
//		Tiger t = (Tiger)a; //형변환 해서 넣기
		
//		t.sound();
//		t.wash();
//				
		
	}

}
