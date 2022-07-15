package com.iu.main;

import java.util.Scanner;

import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CollectionStack collectionStack = new CollectionStack();
		
		//Test data set
		int [] nums = {1,2,3};

		//1. com.iu.util.CollectionStack 클래스 생성
			// add - 새로운 숫자(입력) 추가 무조건 0번(인덱스)에 추가
			// remove - 0번 인덱스 삭제
			// collectionStack.add -> {4,1,2,3}
			// collectionStack.remove -> {2,3}
		
		//2. com.iu.util.CollectionQue
			// add - 새로운 숫자(입력) 추가 무조건 0번(인덱스)에 추가
			// remove - 마지막 인덱스 삭제
			// collectionQue.add -> {4,1,2,3}
			// collectionQue.remove -> {1,2}

		
		//3. com.iu.util.CollectionSet
			// add - 새로운 숫자(입력) 마지막에 추가
			// 단, 중복되지 않는 숫자만 추가
			// remove - 삭제할 숫자를 입력받아서 일치하는 숫자 삭제
			// collectionSet.add -> {1,2,3,4}
			// collectionSet.remove -> {2,3}


		while(true) {
			System.out.println("1. CollectionStack");
			System.out.println("2. CollectionQue");
			System.out.println("3. CollectionSet");
			System.out.println("4. 종료");
			int select = sc.nextInt();
			if (select == 1) {
				while(true) {
					System.out.println("1. CollectionStack.Add");
					System.out.println("2. CollectionStack.Remove");
					System.out.println("3. 종료");
					int selectStack = sc.nextInt();
					if (selectStack == 1) {
						collectionStack.add(nums);
					}else if (selectStack == 2) {
						collectionStack.remove(nums);
					}else {
						break;
					}
				}
					
			}else if (select == 2) {
				
			}else if (select == 3) {
				
			}else {
				break;
			}
			
		}
		
		
		
	}

}
