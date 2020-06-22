package com.programmers.level2.sort;

public class FindPrimeNum {

	public static boolean prime(int n) {
		if(n%2==0) {
			return false;
		}else if(n%3==0) {
			return false;
		}else if(n%5==0) {
			return false;
		}else if(n%7==0) {
			return false;
		}
		return true;
	}
	public static int solution(String numbers) {
		int answer=0; 
		String[]tmp=numbers.split("");
		for(int i=0; i<tmp.length; i++) {
			
		}
		
		
		return answer;
	}
	public static void main(String[] args) {

	}

}
