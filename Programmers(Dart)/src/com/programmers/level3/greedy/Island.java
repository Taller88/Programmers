package com.programmers.level3.greedy;

import java.util.LinkedList;
import java.util.Queue;

public class Island {

	public static void main(String[] args) {
		Island is = new Island();
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		int result = is.solution(4,costs);
		System.out.println("result: "+ result);
		
	}

//	static boolean[]visited = null;
	static int temp = Integer.MAX_VALUE;
	
	 public int solution(int n, int[][] costs) {
	        int answer = 0;
//	        visited= new boolean[n];
	        boolean[] visited= new boolean[n];
	        
	        int[][] arr = new int[n][n];
	        for(int i=0; i<costs.length; i++) {
	        	int start = costs[i][0];
	        	int end = costs[i][1];
	        	int cost = costs[i][2];
	        	arr[start][end]=cost;
	        	arr[end][start]=cost;
	        	
	        }
	        for(int i = 0; i<n; i++) {
	        	visited = new boolean[n];
	        	visited[i]=true;
		        dfs(arr, visited,0,1,i+" ", i);	        	
	        }
	        
	        answer = bfs(arr);
//	        answer = temp;
	        return answer;
	 }

	private void dfs(int[][] arr, boolean[] visited, int cost, int count, String test, int start ) {
		
		if(count==arr.length) {
			boolean check = true;
			
			for(int i=0; i<visited.length; i++) {
				if(!visited[i]) {
					check = false;
					break;
				}
			}
			if(check) {
				if(cost<temp) {
//					System.out.println(test+" cost:"+ cost);
					temp= cost;
				}				
			}
			return;
		}
		
		for(int i=0; i<arr[start].length; i++) {
			if(arr[start][i]>0 && !visited[i]) {
				visited[i]= true;				
//				System.out.println(test);
				dfs(arr, visited, cost+arr[start][i], count+1, test+ i+" ", i);
				visited[i]= false;
			}
		}
		
		
	}
	static class Node{
		int x;
		int cost;
		int count;
		boolean[] visited;
		String test = "";
		public Node() {
		}
		public Node(int x, int cost, int count, boolean[] visited, String test) {
			this.x = x;
			this.cost = cost;
			this.count = count;
			this.visited = visited;
			this.test = test;
		}
	}
	
	static Queue<Node> q = new LinkedList<Node>();
	
	private int bfs(int[][] arr) {
		for(int i =0; i<arr.length; i++) {
			boolean[] visited = new boolean[arr.length];
			visited[i] = true;
			q.add(new Node(i,0,1,visited , i+" "));
		}
		int result = Integer.MAX_VALUE;
		while(!q.isEmpty()) {
			Node n= q.poll();
			System.out.println(n.count);
			if(n.count == arr.length) {
				boolean checkVisited = true;
				System.out.println(n.test);
				for(int i = 0; i<n.visited.length; i++) {
					checkVisited = n.visited[i];
					if(!checkVisited) {
						break;
					}
				}
				if(checkVisited) {
					result = result>n.cost?n.cost:result;
				}
			}else {
				boolean[] check = n.visited;
				for(int i = 0; i<arr[n.x].length; i++) {
					if(!check[i] && arr[n.x][i]>0) {
						check[i]= true;
						
						Node node = new Node(i, n.cost+arr[n.x][i], n.count+1, check, n.test+" "+i+" ");
						
					}
				}
				
			}
		}
		return result;
	}
}
