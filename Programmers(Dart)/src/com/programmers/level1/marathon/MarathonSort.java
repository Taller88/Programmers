package com.programmers.level1.marathon;
import java.util.*;
public class MarathonSort {
/**
 * 참 좋은 코드지만 헷갈리는 코드
 * @param participant
 * @param completion
 * @return
 */
	
	public String solution(String[] participant, String[] completion) {
		      String answer="";
				Arrays.sort(participant);
				Arrays.sort(completion);
				int i;
		        for(i=0; i<completion.length; i++) {
					answer=participant[i];
						System.out.println("i: "+i+" 여기인가?: "+participant[i]);
						System.out.println("i: "+i+" 여기인가?: "+completion[i]);

		            if(!participant[i].equals(completion[i])) {
						System.out.println("중간 return?: "+participant[i]);
		                return participant[i];
					}
		            System.out.println("i: "+i);
					
				}
		        System.out.println("i: "+i+"마지막 return: "+participant[i]);
		                
				return participant[i];
			}	
	}
