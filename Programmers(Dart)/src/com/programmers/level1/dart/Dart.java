package com.programmers.level1.dart;

public class Dart {
	 
	public static int solution(String dartResult) {
	      int answer = 0;
	      int[]scores= {0,0,0};
	      int[]bonus= {1,1,1};
	      int index=0;
	      int result=0;
	      
	 for(int i=0; i<dartResult.length(); i++) {
		 char one=dartResult.charAt(i);
		 if(one>=48 && one<=57) {//숫자 찾기
			 if(dartResult.charAt(i)=='0' && i!=0 && dartResult.charAt(i-1)=='1'){// 약간 꼼수처럼 보이긴한데 통과.. -> 10찾기
				 //i !=0 조건을 추가한건 첫번째 글자가 0일때 charAt에서 OutOfIndexArray방지하고자 
				 scores[index]=10;
				System.out.println("scores[index]1-2="+scores[index]);
					 
				}else {
					 scores[index]=one-48;
						System.out.println("scores[index]2="+scores[index]);
						 
					}
		 }else if(one=='S') {
			 scores[index]=(scores[index])*1;
				System.out.println("scores[index]3="+scores[index]);
				
			 index++;
				 
		 }else if(one=='D') {
			 System.out.println("scores[index]4="+scores[index]);

			 scores[index]=(scores[index])*(scores[index]);
			 
			 System.out.println("scores[index]5="+scores[index]);

			 index++;
		 }else if(one=='T') {
			 scores[index]=(scores[index])*(scores[index])*(scores[index]);

			 index++;
		 }else if(one=='*') {

			if(index==1) {
				 bonus[index-1]*=2;
			}else {
			 bonus[index-1]*=2;
			 bonus[index-2]*=2;
			}
		 }else if(one=='#') {
			
			 bonus[index-1]*=-1;
		 }
		
		 
		 
	 }//for 파라미터로 들어오는 String의 길이 
	 
	 for(int i=0; i<scores.length; i++) {
		 result+=scores[i]*bonus[i];
		 System.out.println(scores[i]+"*"+bonus[i]+"="+scores[i]*bonus[i]);
		 
	 }
	 
	      
	      return  result;
	  }
	 
	public static void main(String[] args) {
//		String dartResult="1D2S0T";
//		String dartResult="1D2S#10S";
		String dartResult="0D#2S*3S";
//		0D#2S*3S
		//System.out.println(solution("1S*2D*3T*"));
		System.out.println("dartResult:"+dartResult);
		System.out.println("최종점수:"+solution(dartResult));
		String test="123";
		System.out.println(test.charAt(0)-48);
		
	}
}
