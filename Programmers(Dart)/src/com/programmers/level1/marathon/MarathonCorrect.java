package com.programmers.level1.marathon;

import java.util.HashMap;
import java.util.Map;

public class MarathonCorrect {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        /**
         * 훌륭하신 분의 코드
         * HashMap안에 'getOrDefault' API가 존재 -> 이는 기존에 Key값이 있으면 기존 값을 get 해오고 없으면 Default로 생성해준다.
         * 내가 짠 코드보다 훨씬 깔끔
         * String answer = "";
        	HashMap<String, Integer> hm = new HashMap<>();
        	for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        	for (String player : completion) hm.put(player, hm.get(player) - 1);

        	for (String key : hm.keySet()) {
            	if (hm.get(key) != 0){
                	answer = key;
            }
        }
         */
        
        
        
        Map<String, Integer> hash=new HashMap<>();
        
        for(String part:participant) {
        	if(hash.get(part)==null) {
        		hash.put(part, 1);
        	}else if(hash.get(part)!=null){
        		//이름이 같은 사람들은 같은 개수만큼 value값을 더해준다.
        		int val=hash.get(part)+1;
        		hash.put(part,val);
        	}
        }
        for(String comp:completion) {
        	//완주자가 있을 경우 기존 hash에 저장된 value값을 하나씩 -1해준다.
        	if(hash.get(comp)!=null) {
        		int val=hash.get(comp)-1;
        		hash.put(comp, val);
        	}
        }
        for(String part:participant) {
        	if(hash.get(part)!=0) {
        		answer=part;
        	}
        }
        
          return answer;
        //정답은 일치하지만 효율성 Check 불통
    }
	
	public static void main(String[] args) {
		
		//String[] participant={"leo", "kiki", "eden"};
		//String[] completion={"eden", "kiki"};
		
		String[] participant={"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion={"josipa", "filipa", "marina", "nikola"};
		
		//String[] participant= {"qw","we","er","qw"};
		//String[] completion= {"er","qw","er"};
		
		//정답: "leo"
		System.out.println(solution(participant,completion ));
	}

}