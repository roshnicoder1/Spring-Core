package org.ibm.core;

public abstract class Calculate {
	protected int a,b;
	public abstract int addsum(int a,int b);

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

}
