package com.iu.main;

import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.unit.Unit;
import com.iu.zerg.Hydra;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		m1.setHp(30);
		System.out.println(m1.getHp());
		m1.info();
		m1.move();
		
		
		Hydra h1 = new Hydra();
		h1.setHp(80);
		System.out.println(h1.getHp());
		
		
		//Marine is a Unit
		//Marine is a Unit
		
		Unit unit = m1;
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
//		System.out.println(unit.getWeapon()); unit타입이라 weapon을 모름
		
		m1 = (Marine)unit;//double을 int로강제변환하듯이
		System.out.println(m1.getWeapon()); //m1타입이라 조회 됨
		

				

	}

}
