package com.programmers.level3.binarySearch;
import java.util.*;

public class Budgets {

	    public static int solution(int[] budgets, int M) {
	        int answer = 0;
	        int max=0;
	        //485
	        Arrays.sort(budgets);
	        //110,120,140,150
	        long tmp=0;
	        for(int i=0; i<budgets.length; i++){
	            tmp+=budgets[i];
	        }
	        if(tmp<M){
	            answer=budgets[budgets.length-1];
	        }else{
	            int temp=0;
	            for(int i=0; i<budgets.length-1; i++){
	                System.out.println("M: "+M);
	                M=M-budgets[i];
	                temp=(M)/(budgets.length-(i+1));
	                System.out.println("budgets[i]: "+budgets[i]);
	                System.out.println("temp: "+temp);
	                if(temp>max){
	                    max=temp;
	                }
	            }
	            answer=max;
	        }
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
