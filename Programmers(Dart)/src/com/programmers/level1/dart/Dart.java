package com.programmers.level1.dart;

public class Dart {
	 
	public static int solution(String dartResult) {
	      int answer = 0;
	      int[]scores= {0,0,0};
	      int[]bonus= {1,1,1};
	      int index=0;
	      int result=0;
	      
	 for(int i=0; i<dartResult.length(); i++) {
		 if(dartResult.charAt(i)>=48 && dartResult.charAt(i)<=57) {//숫자 찾기
			scores[index]=dartResult.charAt(i)-48;
		
			 index++;
			 if(index==3) {
				 index=2;
			 }
		 }else if(dartResult.charAt(i)=='S') {
			 scores[index]=(dartResult.charAt(i-1)-48)*1;
		
				 
		 }else if(dartResult.charAt(i)=='D') {
			 scores[index]=(dartResult.charAt(i-1)-48)*(dartResult.charAt(i-1)-48);
			
		 }else if(dartResult.charAt(i)=='T') {
			 scores[index]=(dartResult.charAt(i-1)-48)*(dartResult.charAt(i-1)-48)*(dartResult.charAt(i-1)-48);
			
		 }else if(dartResult.charAt(i)=='*') {
			 bonus[index]=2;
			 bonus[index-1]=2;
		 }else if(dartResult.charAt(i)=='#') {
			 bonus[index]=-1;
		 }
		
		 
		 
	 }//for 파라미터로 들어오는 String의 길이 
	 
	 for(int i=0; i<scores.length; i++) {
		 result+=scores[i]*bonus[i];
		 System.out.println(scores[i]+"*"+bonus[i]+"="+scores[i]*bonus[i]);
		 
	 }
	      
	      return  result;
	  }
	 
	public static void main(String[] args) {
		String dartResult="1S*1D*3T*";
		//System.out.println(solution("1S*2D*3T*"));
		System.out.println("최종점수:"+solution("1S2D#3T*"));
		String test="123";
		System.out.println(test.charAt(0)-48);
		
	}
}
