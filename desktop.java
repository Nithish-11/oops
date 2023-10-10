package org.system;

public class desktop extends computer {
	public void desktopSize() {
		System.out.println("16:9");
	}
	public static void main(String agrs[]) {
		desktop inheritance = new desktop();
		inheritance.desktopSize();
		inheritance.computerModel();
	}

}
