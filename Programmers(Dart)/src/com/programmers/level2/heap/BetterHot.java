package com.programmers.level2.heap;
import java.util.*;
public class BetterHot {
	 public static int solution(int[] scoville, int K) {
		  int answer = 0;
	        PriorityQueue<Integer> pq=new PriorityQueue<>();
	        boolean check=false;
	        
	        for(int i=0; i<scoville.length; i++){
	            pq.offer(scoville[i]);
	            if(scoville[i]>0){
	                check=true;
	            }
	        }
	        if(!check){
	            return -1;
	        }
	        while(!pq.isEmpty()){
	            int a=pq.poll();//제일 작은 수
	                if(a<K){
	                    try {
		                    int b=pq.poll();// 그 다음 작은 수
		                    pq.offer(a+(b*2));
		                    answer++;
		                	System.out.println("a: "+a+" b: "+b);
		                	System.out.println("size: "+pq.size());
	                    	
	                    }catch(NullPointerException e) {
	                    	return -1;
	                    }
	                }
	        }
	        return answer;
	    }
	 public static void main(String []args) {
		int[]scoville= {0,0,0,0,0,1};
		
		 System.out.println(solution(scoville, 7));
		
	 }
}
