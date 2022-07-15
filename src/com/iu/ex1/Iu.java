package com.iu.ex1;

public class Iu {

	private String name;
	private int age;
	
	private Iu(){ 
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private static Iu iu = null;
	
	public static Iu getInstance() { // 한번만 객체 생성 보장
		if (Iu.iu == null) {
			Iu.iu = new Iu(); // 처음 실행, 새로운 객체 생성
		}
		return Iu.iu; // 두번 실행, 객체 1개 유지
	}
	
	//Setter
	//Public void set변수명 (데이터타입 변수명) {}
	
	//Getter
	//Public 리턴타입 get변수명 () {}
	
	
}
