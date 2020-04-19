package com.programmers.level1.sortString;

import java.util.Arrays;

public class SortString {
	public static String solution(String s) {
	      String answer = "";
	      String in[]=s.split("");
			Arrays.sort(in);
			for(int i=in.length-1; i>=0; i--) {
				answer+=in[i];
			}  
	      return answer;
	  }
	
	public static void main(String[] args) {
		String s="Zbcdefg";
		System.out.println(solution(s));
		
	}

}
