package com.programmers.level2.completedSort;
import java.util.*;
public class MockExamSelf {

	    public int[] solution(int[] answers) {
	        int []f={1, 2, 3, 4, 5};                //5
	        int []s={2, 1, 2, 3, 2, 4, 2, 5};       //8
	        int []t={3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
	        int []score=new int[3];
	        for(int i=0; i<answers.length; i++){
	            if(answers[i]==f[i%5]){
	                score[0]++;
	            }
	            if(answers[i]==s[i%8]){
	                score[1]++;
	            }
	            if(answers[i]==t[i%10]){
	                score[2]++;
	            }
	        }//for
	        System.out.println(score[0]);
	        System.out.println(score[1]);
	        System.out.println(score[2]);
	        int max=score[0];
	        for(int i=0; i<score.length; i++){
	            if(max<score[i]){
	                max=score[i];
	            }
	        }
	        System.out.println("Max: "+max);
	        int cnt=0;
	        for(int i=0; i<score.length; i++){
	            if(max==score[i]){
	                cnt++;
	            }
	        }
	        int[] answer=new int[cnt];
	        int index=0;
	        for(int i=0; i<score.length; i++){
	            if(max==score[i]){
	                answer[index]=i+1;
	                index++;
	            }
	        }
	        
	        return answer;
	    }
	    
	
}
