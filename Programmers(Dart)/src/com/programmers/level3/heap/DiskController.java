package com.programmers.level3.heap;
import java.util.*;
public class DiskController {
	public static void main(String[]args) {
		int[][]jobs= {{2,6},{1,9},{0,3}};
		System.out.println(solution(jobs));
	}
    public static int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<jobs.length; i++){
            pq.offer(jobs[i][0]+jobs[i][1]);
        }
        int time=0;
        int sum=0;
        while(!pq.isEmpty()){
        	
        	for(int i=0; i<jobs.length; i++){
//        		System.out.println("time: "+time+" pq.peek: "+pq.peek());
                if(!pq.isEmpty() &&time>=jobs[i][0]&&pq.peek()==(jobs[i][0]+jobs[i][1])){
                  sum+=time+jobs[i][1]-jobs[i][0];
                  time+=jobs[i][1];
                  pq.poll();
                }
            }
        }
        answer=sum/jobs.length;
        return answer;
    }
}