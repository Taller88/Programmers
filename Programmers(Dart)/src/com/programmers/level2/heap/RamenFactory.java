package com.programmers.level2.heap;

import java.util.*;
public class RamenFactory {
	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer= 0;
		Queue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		int index=0;
		
		for(int i=0; i<k; i++) {
			if(index< dates.length &&i==dates[index]) {
				System.out.println("언제넣어?: "+i);
				pq.offer(supplies[index]);
				index++;
			}
			stock--;
			
			if(!pq.isEmpty() && stock==-1) {
				System.out.println("나오는 값: "+pq.peek());
				stock+=pq.poll();
				
				answer++;
				System.out.println("stock: "+stock);
			}
		}
		
		
		return answer;
	}
	public static void main(String []args) {
		int[]dates= {4,10,15};
		int[]supplies= {20,5,10};
		
		System.out.println(solution(4, dates, supplies, 30));
	}
}
