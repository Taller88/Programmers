package com.programmers.level1.kakao;

public class NumStringAndEnglish {

	public static void main(String[] args) {
		NumStringAndEnglish numStr = new NumStringAndEnglish();
		System.out.println(numStr.solution("123"));
	}
	public int solution(String s) {
        int answer = 0;
        String temp = s;
       temp = temp.replaceAll("zero","0" );
        temp = temp.replaceAll("one","1" );
        temp = temp.replaceAll("two","2" );
        temp = temp.replaceAll("three","3" );
        temp = temp.replaceAll("four","4" );
        temp = temp.replaceAll("five","5" );
        temp = temp.replaceAll("six","6" );
        temp = temp.replaceAll("seven","7" );
        temp = temp.replaceAll("eight","8" );
        temp = temp.replaceAll("nine","9" );
        
        answer = Integer.parseInt(temp);
        
        return answer;
    }
	
}
