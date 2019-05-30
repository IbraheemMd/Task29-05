package org.multilevelinher;

public class Register extends Student {
  public void allotBook(){
	  System.out.println("Through registering");
  }
	public static void main(String[] args) {
		Register h=new Register();
		h.digitalLibrary();
		h.normalLibrary();
		h.book();
		h.author();
		h.allotBook();
		
	}
}
