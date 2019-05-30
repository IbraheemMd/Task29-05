package org.intface;

public class  Bike implements Ktm,Pulsar220 {
	public void cost(){
		System.out.println("1.5lakh");
	}
public	void speed(){
System.out.println("120");
}
public static void main(String[] args) {
	Bike b=new Bike();
	b.cost();
	b.speed();
}
}
