package com.programmers.level2.kakao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceFind {
	public static void main(String[] args) {
		DistanceFind df = new DistanceFind();
		String[][] places = {
							{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, 
							{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
							{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
							{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
							{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
							};
		System.out.println("init!");
		int[] answer = df.solution(places);
		String result = "";
		for(int i=0; i<answer.length; i++) {
			result += answer[i]+" ";
		}
		System.out.println("result: "+result);
	}
	static class Dot{
		int x,y,distance;
		public Dot() {
			// TODO Auto-generated constructor stub
		}
		public Dot(int x, int y, int distance) {
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
	}
	static Queue<Dot> q = null;
	public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for(int i=0; i<places.length; i++) {
        	char[][] arr = new char[5][5];
        	
        	for(int j=0; j<places[i].length; j++) {
        		char[] temp =places[i][j].toCharArray();
        		for(int z=0; z<5; z++) {
        			arr[j][z] = temp[z];
        		}
        	}
        	
        	if(checkCorrect(arr)) {
        		answer[i] =1;
        	}else {
        		answer[i] = 0;
        	}
        	System.out.println("=======================");
        }
        return answer;
    }
	private boolean checkCorrect(char[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]=='P') {
					boolean check  = bfs(arr, i,j);
					System.out.println("result: "+ check);
					if(!check) {
						return false;
					}
				}
			}
		}
		
		return true;
		
	}
	
	private boolean bfs(char[][] arr, int a, int b) {
		q = new LinkedList<>();
		q.add(new Dot(a,b,0));
		
		boolean[][] visited = new boolean[5][5];
		visited[a][b] = true;
		int[] dx = {0,0,-1,1};
		int[] dy = {1,-1,0,0};
		
		
		while(!q.isEmpty()) {
			Dot d = q.poll();
			System.out.println("x: "+d.x+" y: "+ d.y+" dis: "+d.distance);
			for(int i=0; i<4; i++) {
				int x = d.x+dx[i];
				int y = d.y+dy[i];
				if(x>=0 && x<5 && y>=0 && y<5 && d.distance<3 && !visited[x][y]) {
					System.out.println(arr[x][y]);
					if(arr[x][y] =='P' && d.distance!=2) {
						return false;
					}else if(arr[x][y] =='O') {
						q.add(new Dot(x, y, d.distance+1));
						visited[x][y] = true;
					}
				}
				
			}
			
		}
		
		
		return true;
	}
}
