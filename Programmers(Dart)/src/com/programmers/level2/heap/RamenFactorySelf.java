package com.programmers.level2.heap;
import java.util.*;

public class RamenFactorySelf {
	
	    public static int solution(int stock, int[] dates, int[] supplies, int k) {
	        int answer = 0;
	        int index=0;
	        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	        for(int i=0; i<k; i++){//30일간 
	        if(index<dates.length && i==dates[index]){
	            pq.offer(supplies[index]);
	            index++;
	        }
	            
	        if(stock==0){
	            stock+=pq.poll();
	            answer++;
	        }
	         System.out.println("i: "+i +" stock: "+stock);
	            stock--;
	            
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
