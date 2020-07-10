package com.programmers.level3.dfs;

import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

public class Travel {
	static ArrayList<String> list=new ArrayList<>();
	public static String[] solution(String[][] tickets) {
		boolean[]visited=new boolean[tickets.length];
		dfs(tickets,"ICN",0,visited);
		String[]answer=new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i]=list.get(i);
		}
		return answer;
	}
	public static void dfs(String[][] tickets, String start, int idx, boolean[] visited) {
		if(list.size()>tickets.length) {
			return;
		}
		list.add(start);
		
		for(int i=0; i<tickets.length; i++) {
			if(tickets[i][0].equals(start) && !visited[i]) {
				visited[i]=true;
				dfs(tickets, tickets[i][1], i, visited);
				visited[i]=false;
			}
		}
		return;
	}
	public static void main(String []args) {
//		String[][]tickets= {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		String[][]tickets={{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
		String[] arr=solution(tickets);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}	

}
