package com.programmers.kakako;

public class Picture {
	 static int numberOfArea ;
	    static int maxSizeOfOneArea ;
	    static int cnt;
	  public static int[] solution(int m, int n, int[][] picture) {
		  numberOfArea = 0;
		  maxSizeOfOneArea = 0;
		  cnt=0;
	        int[] answer = new int[2];
	        boolean[][] visited=new boolean[m][n];
	        for(int i=0; i<m; i++){
	            for(int j=0; j<n; j++){
	                if(!visited[i][j] && picture[i][j]!=0){
	                	cnt=0;
	                    dfs(picture,i,j,picture[i][j],visited);
	                    System.out.println("maxSizeOfOneArea: "+maxSizeOfOneArea);
	                    System.out.println();
	                	numberOfArea++;
	                }
	            }
	        }
	        answer[0] = numberOfArea;
	        answer[1] = maxSizeOfOneArea;
	       
//	        System.out.println(answer[0]);
//	        System.out.println(answer[1]);
	        return answer;
	    }
	public static void dfs(int[][] picture, int i, int j, int value,boolean[][] visited) {
		if( i>=picture.length||j>=picture[0].length||picture[i][j]!=value || visited[i][j] ) {
			return;
		}
//		if(picture[i][j]!=value || visited[i][j]) {
//			if(maxSizeOfOneArea<cnt) {
//				System.out.println("??i: "+i+" j: "+j);
//				maxSizeOfOneArea=cnt;
//				return;
//			}
//		}
		System.out.println("i: "+i+" j: "+j);
		visited[i][j]=true;
		cnt++;
		if(maxSizeOfOneArea<cnt) {
			maxSizeOfOneArea=cnt;
		}

		if(i<1 && j<1) {
			dfs(picture, i+1, j, value, visited);
			dfs(picture, i, j+1, value, visited);
		}else if(i<1) {
			dfs(picture, i+1, j, value, visited);
			dfs(picture, i, j+1, value, visited);
			dfs(picture, i, j-1, value, visited);
		}else if(j<1) {
			dfs(picture, i+1, j, value, visited);
			dfs(picture, i, j+1, value, visited);
			dfs(picture, i-1, j, value, visited);
		}else {
			dfs(picture, i+1, j, value, visited);
			dfs(picture, i, j+1, value, visited);
			dfs(picture, i-1, j, value, visited);
			dfs(picture, i, j-1, value, visited);
		}
		
		
		
	}
	public static void main(String[] args) {
		int[][]picture= {{1, 1, 1, 0},
						{1, 2, 2, 0},
						{1, 0, 0, 1},
						{0, 0, 0, 1},
						{0, 0, 0, 3},
						{0, 0, 0, 3}};
		solution(6, 4, picture);
	}

}
