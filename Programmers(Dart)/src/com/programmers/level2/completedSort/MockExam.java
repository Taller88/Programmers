package com.programmers.level2.completedSort;

public class MockExam {
	    public int[] solution(int[] answers) {
	        int[] answer = {};
	        int fir[]={1, 2, 3, 4, 5};//5
	        int sec[]={2, 1, 2, 3, 2, 4, 2, 5};//8
	        int third[]={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};//10
	        int cnt[]={0,0,0};
	        for(int i=0; i<answers.length;i++){
	        if(fir[i%5]==answers[i]){
	            cnt[0]++;
	        }
	        if(sec[i%8]==answers[i]){
	            cnt[1]++;
	        }
	        if(third[i%10]==answers[i]){
	            cnt[2]++;
	        }    
	        }
	        int max=cnt[0];
	        int count=0;
	        for(int i=0; i<cnt.length;i++){
	            if(max<cnt[i]){
	                max=cnt[i];
	            }
	        }
	        for(int i=0; i<cnt.length;i++){
	            if(max==cnt[i]){
	                count++;
	            }
	        }
	        System.out.println(max);
	        System.out.println(cnt[1]);
	        
	        answer=new int[count];
	        int test=0;
	        for(int i=0; i<3;i++){
	            if(max==cnt[i]){
	                answer[test]=i+1;
	                test++;
	            }
	        }
	        
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		

	}

}
