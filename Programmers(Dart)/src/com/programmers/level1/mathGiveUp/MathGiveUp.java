package com.programmers.level1.mathGiveUp;

public class MathGiveUp {
	 public static int[] solution(int[] answers) {
		 
	        int[] answer = {};
	        int[]first={1,2,3,4,5};
	        int[]second={2,1,2,3,2,4,2,5};
	        int[]third={3,3,1,1,2,2,4,4,5,5};
	        
	        int best[]={0,0,0};
	       
	        for(int i=0; i<answers.length; i++){
	            if(answers[i]==first[i%first.length]){
	                best[0]+=1;
	            }
	            if(answers[i]==second[i%second.length]){
	                best[1]+=1;
	            }
	            if(answers[i]==third[i%third.length]){
	                best[2]+=1;
	            }
	        }//for
	        
	        for(int i=0; i<best.length; i++){
	                System.out.println("best["+i+"]="+best[i]);
	        }
	        
	        
	        
	        return answer;
	    }
	public static void main(String[] args) {
		
		int []answers= {1,3,2,4,2};
		solution(answers);

	}

}
