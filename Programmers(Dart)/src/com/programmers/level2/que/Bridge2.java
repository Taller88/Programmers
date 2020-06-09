package com.programmers.level2.que;

import java.util.*;

class Bridge2 {
    class Truck{
        int weight;
        int entry;
        Truck(int weight, int entry){
            this.weight=weight;
            this.entry=entry;
        }
    }
    
    
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waiting=new LinkedList<Truck>();
        Queue<Truck> bridge=new LinkedList<Truck>();
        for(int i=0; i<truck_weights.length; i++){
            Truck t=new Truck(truck_weights[i],0);
            waiting.offer(t);
        }
        int time=0;
        int currentWeight=0;
        while(!waiting.isEmpty() || !bridge.isEmpty()){
        
            time++;
          if(!bridge.isEmpty()){
            if(time-bridge.peek().entry==bridge_length ) {
                Truck t=bridge.poll();
               currentWeight-=t.weight;
            }
           }
        //wating을 먼저 하면 3초대에 7 weight를 가진 애가 빠지고 4가 들어가야하는 데 
        //7이 있으니까 4의 값이 들어가질 못한다. 
        //그래서 7을 먼저 bridge에서 빼주고 4를 넣어줘야해서 bride에 있는 값을 먼저 poll()해준다. 
            
            if(!waiting.isEmpty()){
                if(currentWeight+waiting.peek().weight<=weight){
                    Truck t=waiting.poll();
                    bridge.offer(new Truck(t.weight,time));
                    currentWeight+=t.weight;
             }
            }
  
           
            
            
        }
    
        return time;
    }
}