package com.iu.util;

import java.util.Scanner;

public class CollectionStack implements Collection {

	Scanner sc = new Scanner(System.in);
	
	public int[] add(int[] nums) {
		
		System.out.println("입력할 숫자를 입력하시오..");
		int num = sc.nextInt();
		int [] temp = nums;
		nums = new int [nums.length+1];
		nums[0]=num;
		for(int i=0; i<nums.length;i++) {
			nums[i+1]=temp[i+1];
		}
		return nums;
	}
	public int[] remove(int[] numbers) {
		return numbers;
	}

}

//1. com.iu.util.CollectionStack 클래스 생성
	// add - 새로운 숫자(입력) 추가 무조건 0번(인덱스)에 추가
	// remove - 0번 인덱스 삭제
