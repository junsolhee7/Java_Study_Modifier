package com.iu.himart;

public class Computer extends Product{
	
	private String cpu;
	
	public Computer() {
		this.setCpu("ram");
		this.setBrand("Fest");
		this.setPrice(500000);
		this.setPoint(50);
	}
	
	public void info() {
		super.info();
		System.out.println("CPU : "+this.getCpu());
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		cpu = cpu;
	}
}
