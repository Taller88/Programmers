package com.programmers.level2.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {

	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		GameMap gm = new GameMap();
		int result = gm.solution(maps);
		System.out.println("result: "+ result);
	}
	
	public int solution(int[][] maps) {
        int answer = 0;
        
        answer = bfs(maps);
        
        return answer;
    }

	static class Dot{
		int x,y,cnt;
		public Dot() {
		}
		
		public Dot(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}		
		
	}
	
	static Queue<Dot> q = new LinkedList<Dot>();
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	private int bfs(int[][] maps) {
		int result = -1;
		q.add(new Dot(0,0,1));
		boolean[][] visited = new boolean[maps.length][maps[0].length];
		visited[0][0]=true;
		
		while(!q.isEmpty()) {
			Dot d = q.poll();
			if(d.x==maps.length-1 && d.y==maps[0].length-1) {
				result= d.cnt;
				break;
			}
			
			for(int i =0; i<4; i++) {
				int x = d.x+dx[i];
				int y = d.y+dy[i];
				if(x>=0 && y>=0 && x<maps.length && y<maps[0].length && !visited[x][y]&& maps[x][y]==1) {
					visited[x][y]=true;
					q.add(new Dot(x,y,d.cnt+1));
				}
				
			}
		}
		return result;
	}
	

}
