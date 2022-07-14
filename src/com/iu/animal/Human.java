package com.iu.animal;

public class Human {
	
	public int age;
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		
		this.age=0;
		if(age>=0 && age<150) {
			this.age=age;
		}
//		if(age>=0 && age<150) {
//			this.age=age;
//		}else {
//		this.age=0;	
//		}
		
		
	}
	
	public void myPet() {
		Cat cat = new Cat();
		cat.sound();
		cat.age = 5;
		Human human = new Human();
		human.age=
				
	}

}
