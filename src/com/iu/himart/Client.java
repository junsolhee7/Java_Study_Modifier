package com.iu.himart;

public class Client {

	private int money;
	private int point;
	
	public Client() {
		this.money = 30000000;
		this.setPoint(10);
	}
	public void buy(Product product) {
		this.money -= product.getPrice();
		this.point += product.getPoint();
		System.out.println("잔액: " + this.money);
		System.out.println("point: " + this.point);
	}
	public void buy(Computer computer) {
		this.money -= computer.getPrice();
		this.point += computer.getPoint();
		System.out.println("잔액: " + this.money);
		System.out.println("point: " + this.point);
	}
	public void buy(Phone phone) {
		this.money -= phone.getPrice();
		this.point += phone.getPoint();
		System.out.println("잔액: " + this.money);
		System.out.println("point: " + this.point);
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
}
