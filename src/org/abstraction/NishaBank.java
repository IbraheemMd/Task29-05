package org.abstraction;

public class NishaBank extends RbiBank{
 public void saving(){
	 System.out.println("3%");
 }

@Override
public void deosit() {
	System.out.println("6%");
	
}

public static void main(String[] args) {
	NishaBank n=new NishaBank();
	n.saving();
	n.deosit();
	n.fixed();
}
}
