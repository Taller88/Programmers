package com.programmers.level2.greedy;
/**
 * Greedy
 * 테스트는 통과했지만 '시간초과'
 * K자릿수를 만드는 줄알았는데 k자릿수만큼 제거하는거
 * 
 * @author user
 *
 */

public class BiggerNum2 {

	    public static String solution(String number, int k) {
	        String answer = "";
	        int position=number.length()-k-1;
	        int start=0;
	        int maxPosition=0;
	        for(int j=0; j<number.length()-k; j++){//6번 돈다.
	            int max=0;
	            //10-4
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
	    	System.out.println(solution("1231234", 3));
	    	
	    }
}
