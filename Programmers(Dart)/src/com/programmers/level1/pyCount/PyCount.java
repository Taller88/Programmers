package com.programmers.level1.pyCount;

public class PyCount {
 public static boolean solution(String s) {
	 
	boolean answer = true;
    int pCnt=0;
    int yCnt=0;
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='p' || s.charAt(i)=='P'){
            pCnt+=1;
        }
        if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
            yCnt+=1;
        }
    }
    if(pCnt!=yCnt){
        answer=false;
    }
    return answer;
}
	
	public static void main(String[] args) {
		String in="pPooyY";
	System.out.println(solution(in));
	}

}
