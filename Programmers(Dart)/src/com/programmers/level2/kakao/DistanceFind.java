package com.programmers.level2.kakao;

import java.util.Arrays;

public class DistanceFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistanceFind df = new DistanceFind();
		String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		int[] answer = df.solution(places);
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	static int[] result = null;
	public int[] solution(String[][] places) {
	     int[] answer = new int[places.length];
	     result = new int[places.length];
	     Arrays.fill(result, 1);
	     
	     for(int i = 0; i<places.length; i++) {
	    	 char[][] table = new char[5][5];
	    	 for(int j=0; j<table.length; j++) {
	    		 char[] temp = places[i][j].toCharArray();
		    	 table[j] = Arrays.copyOfRange(temp, 0, temp.length) ;
	    	 }
	    	 for(int j=0; j<table.length; j++) {
	    		 for(int z=0; z<table[j].length; z++) {
	    			 findDistance(table,j,z,0,j);
//	    			 if(table[j][z]=='P') {
//	    		    	 if(!) {
//	    		    		 break;
//	    		    	 }
//	    			 }
	    			 
	    		 }
	    	 }
	     }
	     answer = Arrays.copyOfRange(result, 0, result.length);
	     return answer;
	}

	static int[] xArrow = {0,0,-1,1};
	static int[] yArrow = {1,-1,0,0};
	
	private boolean checkRange(int x) {
		if(x>=0 && x<5) {
			return true;			
		}
		return false;
		
	}
	
	private void findDistance(char[][] table, int x, int y, int cnt, int resultIdx) {
		if(cnt>2) {
			return;
		}
		
		for(int i = 0; i<xArrow.length; i++) {
			if(checkRange(x+xArrow[i]) && checkRange(y+yArrow[i])) {
				char status = table[x+xArrow[i]][y+yArrow[i]];
				if(status== 'P') {
					result[resultIdx]=0;
					return;
				}else {
					findDistance(table, x+xArrow[i], y+yArrow[i], cnt+1, resultIdx);
				}				
			}else {
				continue;
			}
		}
		
		return;
	}
	
}
