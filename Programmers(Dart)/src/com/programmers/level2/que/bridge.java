package com.programmers.level2.que;

import java.util.*;
class bridge {
    class Truck {
	int weight;
    int entry;
    
    Truck(int weight, int entry){
        this.weight = weight;
        this.entry = entry;
    }
}
    public int solution(int bridge_length, int weight, int[] truck_weights) {
           Queue<Truck> waiting=new LinkedList<>();
	        Queue<Truck> bridge=new LinkedList<>();
	        int time=0; 
	        int currentBridge=0;
	        for(int i=0; i<truck_weights.length; i++) {//기존에 배열에 저장된 기다리고 있는 Truck의 값을 Queue에 저장해둠
	        	Truck t=new Truck(truck_weights[i], 0);
	        	waiting.offer(t);
	        }
	        
	        while(!waiting.isEmpty() || !bridge.isEmpty()) {
                time++;
                if(!bridge.isEmpty() && time-bridge.peek().entry>=bridge_length) {
	        		Truck t=bridge.poll();
                    currentBridge-=t.weight;
	        	}
	        	if(!waiting.isEmpty() && currentBridge+waiting.peek().weight<=weight) {
	        		Truck t=waiting.poll();
	        		currentBridge+=t.weight;
		        	bridge.offer(new Truck(t.weight, time));
		        	
	        	}
	        	
	        	
	        }
	        
	        
	        return time;
    }
}