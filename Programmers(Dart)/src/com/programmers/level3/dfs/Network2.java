package com.programmers.level3.dfs;

public class Network2 {

	public static void main(String[] args) {
		Network2 net = new Network2();
//		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		
		int answer = net.solution(3, computers);
		System.out.println(answer);
	}
	static boolean[] visited = null;
    
	public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        
        for(int i = 0; i<n; i++) {
        	if(!visited[i]) {
        		dfs(i, computers);
        		answer++;
        	}
        }
        		
        return answer;
    }

	private void dfs(int start, int[][] computers) {
		
		visited[start] = true;
		for(int i = 0; i<computers[start].length; i++) {
			if(computers[start][i]==1 && !visited[i]) {
				dfs(i, computers);
			}
		}
			
		
		
	}
	
	

}
