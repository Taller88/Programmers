package com.programmers.level3;

import java.util.HashMap;

public class DaStepBrush {
	
	public static void main(String[] args) {
		DaStepBrush dsb = new DaStepBrush();
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller = {"young", "john", "tod", "emily", "mary"};
		int[] amount = {12, 4, 2, 5, 10};
		//360, 958, 108, 0, 450, 18, 180, 1080
		
		int[] result = dsb.solution(enroll, referral, seller, amount);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	static class Person{
		String parent = "";
		int benefit = 0;
		public Person() {
		}
		public Person(String person, int benefit) {
			this.parent = person;
			this.benefit = benefit;
		}
	}

	
	static HashMap<String, Person> map =null;
	public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
	        int[] answer = {};
	        map = new HashMap<String, Person>();
	        for(String p: enroll) {
	        	map.put(p, new Person(null, 0));
	        }
	        
	        for(int i=0; i<referral.length; i++) {
	        	if(referral[i].equals("-")) {
	        		continue;
	        	}
	        	Person p = new Person(referral[i],0);
	        	map.put(enroll[i], p);
	        }
	        
	        for(int i=0; i<seller.length; i++) {
	        	insertAmout(seller[i], amount[i]*100);
	        }
	        answer = new int[map.size()];
	        int idx =0;
	        for(int i=0; i<enroll.length; i++) {
	        	Person p = map.get(enroll[i]);
	        	answer[idx++] = p.benefit;
	        }
	        
	        return answer;
	}
	private void insertAmout(String seller, int benefit) {
		Person p = map.get(seller);
		//본인
		if(benefit<10) {
			
			p.benefit+=benefit;
		}else {
			
			int temp = benefit - benefit/10;
			p.benefit += temp;
			map.put(seller, p);
			
			if(p.parent==null) {
				return;
			}
			// 부모
			//360,954,108,0,450,18,180,1080
			insertAmout(p.parent, benefit-temp);
		}
		
		
		
	}
	
	  
}
