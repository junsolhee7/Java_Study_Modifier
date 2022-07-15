package com.iu.main;

import com.iu.terran.Marine;
import com.iu.zerg.Hydra;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		m1.setHp(30);
		System.out.println(m1.getHp());
		m1.info();
		m1.move();
		
		
		Hydra h1 = new Hydra();
		h1.setHp(80);
		System.out.println(h1.getHp());
		
		
		
		

				

	}

}
