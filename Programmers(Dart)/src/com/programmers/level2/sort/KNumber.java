package com.programmers.level2.sort;
import java.util.*;

public class KNumber {
	    public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        for(int i=0; i<commands.length; i++){
	            int[]arr=new int[commands[i][1]-commands[i][0]+1];
	            int idx=0;
	            for(int j=commands[i][0]-1 ; j<=commands[i][1]-1; j++){
	                arr[idx]=array[j];
	                idx++;
	            }
	            Arrays.sort(arr);
	            answer[i]=arr[commands[i][2]-1];
	            
	        }
	        
	        return answer;
    }
	   public static void main(String []args) {
		   int[]array= {1, 5, 2, 6, 3, 7, 4};
		   int[][]commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		   
		   int[] answer=solution(array, commands);
		   for(int i=0; i<answer.length; i++) {
			   System.out.println(answer[i]);
		   }
	   }
}
