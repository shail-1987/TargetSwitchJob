package com.java.practice;

import org.testng.annotations.Test;

public class BasicsOfJava {
	
	static boolean primeNumber(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
	
	
	static void print1to10 (){
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
	}
	
	static void printname() {
		int a=1;
		while(a<=10){
			System.out.println("preethi");
			a++;
		}
		System.out.println("loop ends");
	}
	
	
	
	
	
	

	public static void main(String[] args) {

		System.out.println("primenum" + "" + primeNumber(5));
	//	print1to10();
		printname();
	}

}


