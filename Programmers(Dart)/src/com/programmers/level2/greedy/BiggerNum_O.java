package com.programmers.level2.greedy;
/**
 * 진짜 충격의 문제
 * @author user
 *
 */
public class BiggerNum_O {
	    public static String solution(String number, int k) {
	        	StringBuilder answer = new StringBuilder();
		        int position=number.length()-k-1;
		        int start=0;
		        int maxPosition=0;
		        for(int j=0; j<number.length()-k; j++){//각 자릿수
		            int max=-1;
		            //10-4
		            for(int i=start; i<number.length()-position; i++){//해당 범위에서 최대값찾기
		                if(max<number.charAt(i)-'0'){
		                    max=number.charAt(i)-'0';
		                    maxPosition=i;//최대값을 찾은 위치를 저장 -> 나중에 이거 +1 부터 start
		                }
		            }
	                start=maxPosition+1;
	                position--;
		            answer.append(number.charAt(maxPosition));
	                
		        }
		        return answer.toString();
	    }
	
	    
}
