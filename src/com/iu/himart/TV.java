package com.iu.himart;

public class TV extends Product{
	
	private int size;
	public TV() {
		this.setSize(500);
		this.setBrand("Flip");
		this.setPrice(500000);
		this.setPoint(50);
	}
	
	public void info() {
		super.info();
		System.out.println("Size :" + this.getSize());
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
