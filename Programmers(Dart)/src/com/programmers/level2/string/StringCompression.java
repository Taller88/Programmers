package com.programmers.level2.string;

public class StringCompression {

	public int solution(String s) {
		System.out.println("s: "+ s);
        int answer = 0;
        String result = "";
        for(int i = 1; i<s.length()/2; i++) {// i는 잘라서 비교할 문자열 길이
        	String target = s.substring(0,i);// a
        	String temp = "";
        	int cnt = 1;
        	String str = "";
        	System.out.println("target: "+ target);
        	for(int j = i; j<s.length(); j+=i) {// j는 문자열 인덱스?
        		if(i+j>s.length()) {
        			break;
        		}
        		temp = s.substring(j, i+j);
        		System.out.println("target: "+target+" temp: "+temp);
        		if(target.equals(temp)) {
        			cnt++;
        		}else if(cnt >1){
        			result += cnt+target;
        			cnt = 1;
        			target = temp;
//        			j+=i;
        		}else {
        			result += temp;
        			cnt = 1;
        			target =temp;
        		}
        	}
        	
        }
        System.out.println(result);
        return answer;
    }
	
	public static void main(String[]args) {
		StringCompression sc = new StringCompression();
//		sc.solution("abcabcabcabcdededededede");
		sc.solution("aabbaccc");
	}
}
