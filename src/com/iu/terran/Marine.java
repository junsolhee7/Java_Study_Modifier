package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit implements Attacker{
	
	
	private String weapon;
	
	public String getWeapon() {
		return weapon;
	}
	public Marine() {
		super(30);
		System.out.println("Marine 생성자");
	}
	
	//오버라이딩
	public void move() {
		super.info();
		System.out.println("뛰어다님");
	}
	//오버라이딩
	public void info() {
		System.out.println("Marine Info");
		
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	 
	
	public void Attack() {
		this.shoot();
	}
	private void shoot() {
		System.out.println("우다다닫");
	}
	
	
}
