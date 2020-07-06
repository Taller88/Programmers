package com.programmers.level3.dfs;

public class Network {
	static int answer;
	 public static int solution(int n, int[][] computers) {
		 answer=n;
		 boolean[]visited=new boolean[n];
		 for(int i=0; i<n; i++) {
			 dfs(computers,i,visited);
		 }
		 
		 return answer;
	 }
	 

	public static void dfs(int[][] computers, int s, boolean[] visited) {
		if(visited[s]) {
			return;
		}
		visited[s]=true;
		for(int i=0; i<computers.length; i++) {
			if(!visited[i] &&computers[s][i]==1) {
				answer--;
				dfs(computers, i, visited);
			}
		}
		
	}


	public static void main(String[] args) {
		int n=3;
		int [][]computers= {{1,1,0},{1,1,0},{0,0,1}};
		System.out.println(solution(n, computers));
	}

}
