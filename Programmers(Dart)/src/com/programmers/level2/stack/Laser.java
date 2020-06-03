package com.programmers.level2.stack;
import java.util.*;

public class Laser {

	    public int solution(String arrangement) {
	        int answer = 0;
	        Stack<Character> stk=new Stack<>();
	        
	        arrangement=arrangement.replace("()", "1");  
	        for(int i=0; i<arrangement.length(); i++){
	            if(arrangement.charAt(i)=='('){
	                stk.push('(');
	            }
	            if(arrangement.charAt(i)=='1'){
	                answer+=stk.size();
	            }
	            if(arrangement.charAt(i)==')'){
	                stk.pop();
	                answer+=1;
	            }
	            
	        }
	        
	        return answer;
	    }
	
}
