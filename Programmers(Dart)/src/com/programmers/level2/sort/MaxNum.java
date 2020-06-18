package com.programmers.level2.sort;
import java.util.*;

public class MaxNum {
	    public String solution(int[] numbers) {
	        StringBuilder answer= new StringBuilder();
	        String[] tmp=new String[numbers.length];
	        for(int i=0; i<numbers.length; i++){
	            tmp[i]=String.valueOf(numbers[i]);
	        }
	        
	        Arrays.sort(tmp, Collections.reverseOrder());
	        
	        for(int i=0; i<tmp.length; i++){
	            System.out.println(tmp[i]);
	            answer.append(tmp[i]);
	        }
	        return answer.toString();
	    }
	
}
