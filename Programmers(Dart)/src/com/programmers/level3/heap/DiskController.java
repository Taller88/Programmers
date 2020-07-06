package com.programmers.level3.heap;
import java.util.*;
public class DiskController {
	static class Job{
        int entry;
        int spend;
        Job(int e, int s){
            this.entry=e;
            this.spend=s;
        }
    }
    public static int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Job> pq=new PriorityQueue();
        
        
        
        return answer;
    }
    public static void main(String[]args) {
    	int[][]job= {{0, 3}, {1, 9}, {2, 6}};
    	solution(job);
    }
}