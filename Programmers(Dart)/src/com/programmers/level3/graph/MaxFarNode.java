package com.programmers.level3.graph;
import java.util.*;
public class MaxFarNode {
	static boolean[][] arr;
    static int answer=0;
    static int depth=0;

    public static int solution(int n, int[][] edge) {
        arr=new boolean[n+1][n+1];
        boolean[] visited=new boolean[n+1];
        for(int i=0; i<edge.length; i++){
            arr[edge[i][0]][edge[i][1]]=arr[edge[i][1]][edge[i][0]]=true;
        }
        bfs(1, visited);
        return answer;
    }
    public static void bfs(int start, boolean[] visited){
        Queue<Dot> q=new LinkedList<>();
        int depth=0;
        q.add(new Dot(start,depth));
        visited[start]=true;
        while(!q.isEmpty()){
            Dot node=q.poll();
//            System.out.println("idx: "+node.idx+" dep: "+node.dep);
            int cnt=0;
            int dep=node.dep;
            for(int i=0; i<arr.length; i++){
                if(arr[node.idx][i] && !visited[i]){
                    cnt++;
                    visited[i]=true;
                    arr[node.idx][i]=false;
                    q.add(new Dot(i,node.dep+1));
                }
            }
            if(depth<=dep){
                if(depth<dep){
                    answer=1;
                    depth=dep;
                }else{
                    answer++;
                }
            }
            
        }
    
    }
	static class Dot{
	    int idx;
	    int dep;
	    public Dot(int idx, int dep){
	        this.idx=idx;
	        this.dep=dep;
	    }
	}
	public static void main(String[] args) {
		int[][] edge= {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};	
		System.out.println(solution(6, edge));
	}

}
