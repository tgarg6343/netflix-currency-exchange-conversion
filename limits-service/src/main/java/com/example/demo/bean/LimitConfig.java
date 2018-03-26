package com.example.demo.bean;

public class LimitConfig {

	int maximum;
	int minimum;
	protected LimitConfig() {
		
	}
	public LimitConfig(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
		System.out.println(maximum);
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
