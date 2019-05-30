package org.hirarchical;

public class AxisBank extends RbiBank {
	public void saving() {
		System.out.println("5");
	}
public void fixed() {
	System.out.println("8");
}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.saving();
	a.fixed();
	a.deposit();
}
}
