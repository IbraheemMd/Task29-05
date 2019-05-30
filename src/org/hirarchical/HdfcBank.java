package org.hirarchical;

public class HdfcBank extends RbiBank {
	public void deposit() {
		System.out.println("4");
	}
  public void fixed() {
	System.out.println("7");
}
  public static void main(String[] args) {
	HdfcBank h=new HdfcBank();
	h.deposit();
	h.fixed();
	h.saving();
}
}
