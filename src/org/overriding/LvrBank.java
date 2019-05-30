package org.overriding;

public class LvrBank extends RbiBank {
	public void deposit() {
		System.out.println("4%");
	} 
public void fixed() {
	System.out.println("8%");
}
public static void main(String[] args) {
	LvrBank l=new LvrBank();
	l.deposit();
	l.saving();
	l.fixed();
}
}
