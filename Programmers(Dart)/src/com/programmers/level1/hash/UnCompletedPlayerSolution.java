package com.programmers.level1.hash;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class UnCompletedPlayerSolution {
	 public static String solution(String[] participant, String[] completion) {
		 String answer="";
		 Arrays.sort(participant);
		 Arrays.sort(completion);
		 for(int i=0; i<completion.length;i++) {
			 if(!participant[i].equals(completion[i])) {
				answer=participant[i];
				break;
			 }
		 }
		 if(answer.equals("")) {
			 answer=participant[participant.length-1];
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
