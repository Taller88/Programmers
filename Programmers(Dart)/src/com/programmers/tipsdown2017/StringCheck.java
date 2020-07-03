package com.programmers.tipsdown2017;
import java.util.*;

public class StringCheck {
	    public static int solution(String s) {
	        int answer = 0;
	        Stack<Character> stk=new Stack<>();
	        for(int i=0; i<s.length(); i++){
	            if(!stk.isEmpty() && stk.peek()==s.charAt(i)){
	                stk.pop();
	            }else{
	                stk.push(s.charAt(i));
	            }
	        }
	        if(stk.isEmpty()){
	            answer=1;
	        }else{
	            answer=0;
	        }

	        return answer;
	    }
	    public static void main(StringCheck[]args) {
	    	System.out.println(solution("baabaa"));
	    }
	}
