package com.iu.unit;

public abstract class Unit {//객체로생성하기엔 명확하지않아서 
	
	//클래스간의 공통 요소
	private int hp;
	private String color;
	private String name;
	
	public Unit() {
		System.out.println("Super 생성자");
	}
	public abstract void move();
	
	public abstract void attack();
	
	public void info() {
		System.out.println("Super Info");
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Unit(int hp) {
		
	}
	

}
