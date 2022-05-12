package com.programmers.level1.backNumber;

import java.util.Arrays;

public class MissingNumPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumPlus mnp = new MissingNumPlus();
		int[] arr = {1,2,3,4,6,7,8,0};
		int result = mnp.solution(arr);
		System.out.println("result: "+ result);
		
	}
	 public int solution(int[] numbers) {
	        int answer = 0;
	        Arrays.sort(numbers);
	        for(int i = 0; i<numbers.length; i++) {
	        	answer+=numbers[i];
	        }
	        
	        return 45-answer;
	    }
	 

}
