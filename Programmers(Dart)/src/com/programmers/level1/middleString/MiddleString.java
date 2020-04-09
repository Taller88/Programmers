package com.programmers.level1.middleString;

public class MiddleString {
	public static String solution(String s) {
	   
		
		/**
		 * 	가운데 글자 찾기 
		 * 	Param으로 들어오는 s의 길이가 홀수면 가운데 글자만 
		 * 					짝수면 가운데 두글자만 return	
		 */
		
		
		
		String answer = "";
	    int len=s.length();
	    if(len%2==1){
	        answer=s.substring(len/2,len/2+1);
	    }else{
	    	answer=s.substring(len/2-1,len/2+1);
	    }
	return answer;
	/**
	 * 더 훌륭한 코드 
	 * s.subString(s.length-1/2,s.length/2+1);
	 */
	

	}
	public static void main(String[] args) {
		System.out.println(solution("abcdef"));

	}

}
