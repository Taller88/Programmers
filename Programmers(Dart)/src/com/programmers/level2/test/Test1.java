package com.programmers.level2.test;

public class Test1 {
	    public static String recrusion(int n){
	        if(n<=3) {
	        	if(n%3==0) {
	        		return "4";
	        	}else {
	        		return String.valueOf(n%3);
	        	}
	        }else {//4
	        	if(n/3>=3) {
	        		String t="";
	        		if(n%3==0) {
	        			t="4";
	        		}else {
	        			t=String.valueOf(n%3);
	        		}
	        		return recrusion(n/3)+t;
	        	}else {
		        	return String.valueOf(n/3)+String.valueOf(n%3);
	        	}
	        }
	        
	    }
	    public static String solution(int n) {
	        String answer = recrusion(n);
	        
	        return answer;
	    }
	public static void main(String[] args) {
		System.out.println(solution(9));
	}

}
