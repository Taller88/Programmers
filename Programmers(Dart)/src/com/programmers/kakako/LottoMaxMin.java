package com.programmers.kakako;

import java.util.Arrays;

import javax.management.MBeanServer;

public class LottoMaxMin {
	//1등 6
	//2등 5
	//3등 4
	//4등 3
	//5등 2
	//6등 1
	
	 public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        
	        Arrays.sort(lottos);
	        Arrays.sort(win_nums);
	        int same = 0;
	        int zeroCount = 0;
	        for(int i = 0; i<lottos.length; i++) {
	        	if(lottos[i]!=0) {
	        	for(int j = 0; j<win_nums.length; j++) {
	        		if(lottos[i]==win_nums[j]) {
	        			same++;
	        			break;
	        		}
	        	}
	        	}else {
	        		zeroCount++;
	        	}
	        }
	        System.out.println("zeroCnt: "+zeroCount+"same: "+same);
	        if(zeroCount+same == 6) {
	        	answer[0] = 1;
	        }else if(zeroCount+same == 5) {
	        	answer[0] = 2;
	        }else if(zeroCount+same == 4) {
	        	answer[0] = 3;
	        }else if(zeroCount+same == 3) {
	        	answer[0] = 4;
	        }else if(zeroCount+same == 2) {
	        	answer[0] = 5;
	        }else{
	        	answer[0] = 6;
	        }
	        
	        if(same == 6) {
	        	answer[1] = 1;
	        }else if(same == 5) {
	        	answer[1] = 2;
	        }else if(same == 4) {
	        	answer[1] = 3;
	        }else if(same == 3) {
	        	answer[1] = 4;
	        }else if(same == 2) {
	        	answer[1] = 5;
	        }else{
	        	answer[1] = 6;
	        }
	        
	        
	        return answer;
	  }
	 
	public static void main(String[]args) {
		LottoMaxMin a = new LottoMaxMin();
		int[] lottos = {44, 1, 0, 0, 31, 25};
		
		int[] win_nums= {31, 10, 45, 1, 6, 19};
		
		a.solution(lottos, win_nums);
	}
}
