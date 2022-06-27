package com.programmers.level2.sense;

public class TrangleSnail {

	public static void main(String[] args) {
		TrangleSnail ts = new TrangleSnail();
		int[] answer = ts.solution(4);
		String temp = "";
		for(int i=0; i<answer.length; i++) {
			temp+= answer[i]+" ";
		}
		System.out.println(temp);
		
	}
	public int[] solution(int n) {
	   int[] answer = {};
	   int[][] arr = new int[n][n];
	   int max = (n*(n+1))/2;
	   int value = 1;
	   int x = -1;
	   int y = 0;
	   int direction = 1;
	   int count = 0;
	   
	   for(int i = 0; i<n; i++) {
		   for(int j=i; j<n; j++) {
			   count++;
			   if(i%3==0) {
				   ++x;
			   }else if(i%3==1) {
				   y++;
			   }else if(i%3==2) {
				   x--;
				   y--;
			   }
			   arr[x][y]= value++;
			   
		   }
	   }
	   
	   answer = new int[count];
	   int idx = 0;
	   for(int i = 0; i< arr.length; i++) {
		   for(int j = 0; j<arr[0].length; j++ ) {
			   if(arr[i][j]!=0) {
				   answer[idx++] = arr[i][j];
			   }
		   }
	   }
	   
	   
	   return answer;
	}
}
