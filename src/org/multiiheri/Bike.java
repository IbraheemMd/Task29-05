package org.multiiheri;

public  class Bike implements Duke,pulsar {

	@Override
	public void cc() {
		System.out.println("150cc");
		
	}

	@Override
	public void cost() {
		System.out.println("1lakh");
		
	}

	@Override
	public void speed() {
		System.out.println("150kmph");
		
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.cc();
		b.cost();
		b.speed();
		
	}
	

}
