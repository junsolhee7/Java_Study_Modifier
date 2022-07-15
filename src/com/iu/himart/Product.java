package com.iu.himart;

public class Product {

//	브랜드
//	가격
//	point
//	메서드 : info => 모든 멤버 변수 정보 출력
//  전화기
	private String brand;
	private int price;
	private int point;
	
	public void info() {
	System.out.println("=========================");
	System.out.println("Brand : "+this.getBrand());
	System.out.println("Price : "+this.getPrice());
	System.out.println("Point : "+this.getPoint());
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
