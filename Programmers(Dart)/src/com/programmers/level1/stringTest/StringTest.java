package com.programmers.level1.stringTest;

public class StringTest {

	 public static boolean solution(String s) {
	      boolean answer = true;
	      for(int i=0; i<s.length(); i++){
	          if(s.charAt(i)<48 || s.charAt(i)>57 ||(s.length()!=4 && s.length()!=6)){
	            answer=false;
	           
	          }//문자check
	        }//for
	      return answer;
	  }
	
	
	public static void main(String[] args) {
		String s="a123";
		System.out.println(solution(s));
	}

}
