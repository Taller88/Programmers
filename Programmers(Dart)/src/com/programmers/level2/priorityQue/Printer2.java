package com.programmers.level2.priorityQue;

import java.util.PriorityQueue;

public class Printer2 {

	public static void main(String[]args) {
	
		Printer2 p2 = new Printer2();
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 5;
		
		int result = p2.solution(priorities, location);
		System.out.println(result);
	}
	static class Dot implements Comparable<Dot>{

		int key;
		int value;
		
		public Dot() {
		}
		
		public Dot(int key, int value) {
			this.key = key;
			this.value = value;
		}
		
		@Override
		public int compareTo(Dot o) {
			if(this.value<o.value) {
				return 1;
			}else if(this.value>o.value) {
				return -1;
			}
			return 0;
		}
		
	}
	public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Dot> pq = new PriorityQueue<Dot>();
        for(int i=0; i<priorities.length; i++) {
        	pq.offer(new Dot(i,priorities[i]));
        	System.out.println("key: "+i+" prior: "+ priorities[i]);
        }
        
        System.out.println("=========");
        while(!pq.isEmpty()) {
        	answer++;
        	Dot d = pq.poll();
        	System.out.println("key: "+ d.key+ " value: "+d.value);
        	if(d.key == location) {
        		break;
        	}
        }
        
        return answer;
    }
	
}
