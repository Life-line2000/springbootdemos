package com.example.training.addition;

public class Addition {
	
	private int a;
	private int b;
	private int result;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	//getter
	public int getA() {
		return a;
	}
	//setter
	public void setA(int a) {
		this.a =a;
	}
	//getter
	public int getB() {
		return b;
	}
	//setter
	public void setB(int b) {
		this.b = b;
	}
	public void process() {
		this.result = this.a + this.b;
	}

}
