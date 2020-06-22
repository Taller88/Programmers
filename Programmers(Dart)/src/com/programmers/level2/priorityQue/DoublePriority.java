package com.programmers.level2.priorityQue;
import java.util.*;

public class DoublePriority {
	    public int[] solution(String[] operations) {
	        int[] answer = new int[2];
	        PriorityQueue<Integer> aPq=new PriorityQueue<>();
	        PriorityQueue<Integer> dPq=new PriorityQueue<>(Collections.reverseOrder());
	        for(int i=0; i<operations.length; i++){
	            if(operations[i].contains("I")){
	                String [] tmp=operations[i].split(" ");
	                dPq.offer(Integer.parseInt(tmp[1]));
	                aPq.offer(Integer.parseInt(tmp[1]));
	            }else if(!dPq.isEmpty() && operations[i].equals("D 1")){
	                int max=dPq.peek();
	                dPq.remove(max);
	                aPq.remove(max);
	            }else if(!dPq.isEmpty() && operations[i].equals("D -1")){
	                int min=aPq.peek();
	                dPq.remove(min);
	                aPq.remove(min);
	            }
	        }
	        if(dPq.isEmpty() ||aPq.isEmpty()){
	            answer[0]=0;
	            answer[1]=0;
	        }else{
	            answer[0]=dPq.poll();
	            answer[1]=aPq.poll();
	        }        
	        return answer;
	    }

}
