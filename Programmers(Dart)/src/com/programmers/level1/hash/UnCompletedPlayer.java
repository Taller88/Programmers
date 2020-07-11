package com.programmers.level1.hash;
/**
 * 시간초과 뜸 정답은 일치
 * @author user
 *
 */
public class UnCompletedPlayer {
	 public static String solution(String[] participant, String[] completion) {
		 String answer="";
		 for(int i=0; i<participant.length; i++) {
			  for(int j=0; j<completion.length; j++) {
				 if(participant[i].equals(completion[j])) {
					 participant[i]="";
					 completion[j]="";
					 
				 }
			 }
		 }
		 for(int i=0; i<participant.length; i++) {
			 if(!participant[i].equals("")) {
				 answer=participant[i];
						 
			 }
		 }
		 System.out.println(answer);
		 return answer;
	 }
	 
	public static void main(String[] args) {
		String[] participant= {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
		// 답: mislav
		solution(participant, completion);
	}

}
