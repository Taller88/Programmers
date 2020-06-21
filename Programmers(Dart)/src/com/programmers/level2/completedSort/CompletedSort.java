package com.programmers.level2.completedSort;

class CompletedSort {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width=0;
        int height=0;
        int tmp=0;
        for(int i=0; i<yellow; i++){
            if(yellow%(i+1)==0){
                if( ((i+1)*2)+(yellow/(i+1)+2)*2==brown){
                  tmp=(i+1);
                  System.out.println(tmp);
                }
            }    
        }
        answer[0]=tmp+2;
        answer[1]=(brown-(2*tmp))/2;
        return answer;
    }
    
    public static void main(String[]args) {
    	int brown=8;
    	int yellow=1;
    	int [] a=solution(brown, yellow);
    	System.out.println("a[0]: "+a[0]);
    	System.out.println("a[1]: "+a[1]);
    }
}
