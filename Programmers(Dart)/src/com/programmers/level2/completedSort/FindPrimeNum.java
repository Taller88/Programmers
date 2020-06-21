package com.programmers.level2.completedSort;

public class FindPrimeNum {

	public static boolean check(int x){
        if(x%2==0){
            return false;
        }else if(x%3==0){
            return false;
        }else if(x%5==0){
            return false;
        }else if(x%7==0){
            return false;
        }
        return true;
    }
	
	 public static int solution(String numbers) {
	        int answer = 0;
	        String[] arr=numbers.split("");
	        for(int i=0; i<=arr.length; i++){
	        	if(arr[0].equals("0") && check(Integer.parseInt(arr[0]))) {
	        		answer++;
	        	}
	        	
	        	
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
