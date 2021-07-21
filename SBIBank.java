package org.bank;

public class SBIBank implements RBIBank {
	@Override
	public void savings() {
		
	}
	@Override
	public void fixed() {
		
	}
	public static void main(String[] args) {
		SBIBank s = new SBIBank();
		s.savings();
		s.fixed();
	}
}
