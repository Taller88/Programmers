package com.programmers.level1.greedy;

import java.util.Arrays;

public class Physical_greedy {

	public static void main(String[] args) {
		int n=5; 
		int[] lost= {2,4};
		int[] reserve= {3};
		/**
		 * 1번 학생이 2번 학생에게 체육복을 빌려주고, 
		 * 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 
		 * 학생 5명이 체육수업을 들을 수 있습니다.
		 * 
		 */
		System.out.println(solution(n,lost,reserve));
	}


	
	
	public static int solution(int n, int[] lost, int[] reserve) {
		   int answer =n-lost.length;
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        
	        //여벌을 가지고 있는 학생이 도난 당한 경우
	            for(int i=0; i<lost.length; i++){
		            for(int j=0; j<reserve.length; j++) {
	                if(lost[i]==reserve[j]){
	                    //여벌을 가지고 있는 학생이 도난을 당했으므로 빌려줄 수가 없다.
	                    reserve[j]=-1;
	                    lost[i]=-1;
	                    answer++;
	                    break;
	                    }
	                }
	            }
	 
		        for(int i=0; i<lost.length; i++){
		            for(int j=0; j<reserve.length; j++) {
		            	if((lost[i]==reserve[j]-1||lost[i]==reserve[j]+1) && lost[i]>0 && reserve[j]>0) {
		            		answer++;
	                        reserve[j]=-1;
		            		break;
		            	}
	                   
		            }
		        }
		        return answer;
		    }
}
