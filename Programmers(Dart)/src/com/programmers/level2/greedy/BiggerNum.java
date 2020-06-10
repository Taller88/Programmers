package com.programmers.level2.greedy;
/**
 * Greedy
 * 문제 잘못이해함 
 * K자릿수를 만드는 줄알았는데 k자릿수만큼 제거하는거
 * 
 * @author user
 *
 */

public class BiggerNum {

	    public static String solution(String number, int k) {
	        String answer = "";
	        int position=k-1;
	        int start=0;
	        int maxPosition=0;
	        for(int j=0; j<k; j++){
	            int max=0;
	            for(int i=start; i<number.length()-position; i++){
	                if(max<Integer.parseInt(number.split("")[i])){
	                    max=Integer.parseInt(number.split("")[i]);
	                    maxPosition=i;
	                }
	            }
	            start=maxPosition+1;
	            position--;
	            answer+=max+"";
	            
	        }
	        return answer;
	    }

	    public static void main(String []args) {
	    	System.out.println(solution("4177252841", 4));
	    	
	    }
}
