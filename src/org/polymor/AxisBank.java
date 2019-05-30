package org.polymor;

public class AxisBank extends BankInfo{
public void deposit(){
	
	System.out.println("3%");
}
 public static void main(String[] args) {
	AxisBank ab=new AxisBank();
	ab.saving();
	ab.deposit();
	ab.fixed(); 
}
}
