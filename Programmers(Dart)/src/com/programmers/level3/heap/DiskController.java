package com.programmers.level3.heap;
import java.util.*;
import java.util.*;
class DiskController {
    public static int solution(int[][] jobs) {
        
        int answer = 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<jobs.length; i++){
            pq.add(jobs[i][0]+jobs[i][1]);
        }
        int sum=0;
        int time=0;
        
        int t=pq.poll();
            int index=0;
            for(int i=0; i<jobs.length; i++){
                if(t==(jobs[i][0]+jobs[i][1])){
                    index=i;
                }
            }
        sum+=(time+jobs[index][0])+jobs[index][1];
        time+=jobs[index][1];
            
        while(!pq.isEmpty()){
            t=pq.poll();
            index=0;
            for(int i=0; i<jobs.length; i++){
                if(t==(jobs[i][0]+jobs[i][1])){
                    index=i;
                }
            }
            time+=jobs[index][1];
            sum+=(time-jobs[index][0]);
            
            System.out.println("time: "+time);
            System.out.println((time-jobs[index][0])+jobs[index][1]);
            
            
        }
        answer=sum/jobs.length;
        return answer;
    }
}