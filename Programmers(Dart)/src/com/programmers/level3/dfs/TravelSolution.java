package com.programmers.level3.dfs;
import java.util.*;

public class TravelSolution {

	    public static ArrayList<String> list=new ArrayList<>();
	    
		    public static void dfs(String[][] tickets, String depart,String t, int cnt,boolean[]visited){
		    	t+=depart+",";
		        
		    	if(cnt==tickets.length){
		    		list.add(t);
		    		return;
		    	}
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
		        System.out.println(list.size());
		    	
		        Collections.sort(list);
		        String[] answer = list.get(0).split(",");
		        return answer;
		    }

	public static void main(String[] args) {
		String[][]tickets= {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
//		String[][]tickets={{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
		String[] arr=solution(tickets);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
