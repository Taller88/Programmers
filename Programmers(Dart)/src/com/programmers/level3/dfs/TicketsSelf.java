package com.programmers.level3.dfs;
import java.util.*;

public class TicketsSelf {
	static ArrayList<String> list=new ArrayList<>();
    
	    public static void dfs(String[][] tickets, String depart,String t, int cnt,boolean[]visited){
	    	t+=depart+",";
	        
	    	if(cnt==tickets.length){
	    		System.out.println();
	    		System.out.println("ArrayList.add("+t);
	    		System.out.println();

	    		list.add(t);
	    		return;
	    	}
	    	System.out.println(cnt+"번째 방문중");
	    	System.out.println(t);
			for(int i=0; i<tickets.length; i++){
	            if(depart.equals(tickets[i][0])&&!visited[i]){
	                visited[i]=true;
	                dfs(tickets,tickets[i][1],t, cnt+1,visited);
	                visited[i]=false;
	            }
	        }
	    }
	    public static String[] solution(String[][] tickets) {
	        boolean[]visited=new boolean[tickets.length];
	        
	        dfs(tickets,"ICN","",0 ,visited);
	        Collections.sort(list);
	        String[] answer = list.get(0).split(",");
	        for(int i=0; i<answer.length; i++) {
	        	System.out.println(answer[i]);
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		String[][] tickets= {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		solution(tickets);
	}

}
