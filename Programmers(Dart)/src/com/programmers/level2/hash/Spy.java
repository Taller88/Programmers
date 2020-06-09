package com.programmers.level2.hash;
import java.util.*;

public class Spy {
	public int solution(String[][] clothes) {
		int result=1;
		HashMap<String, Integer> map=new HashMap<>();
		for(String [] cloth: clothes) {
			map.put(cloth[1], map.getOrDefault(cloth[1], 0)+1);
		}
		for(String key: map.keySet()) {
			result*=map.get(key)+1;
			/**
			 * 식 정리 
			 * face에 3개의 옷, eye에 2개의 옷이 있다고 가정하자 
			 * 그러면 나오는 경우의 수를 face 3개의 옷에다가 face의 의류를 고르지 않는 '없음'의 경우의 수를 추가하자
			 * 그러면 result=(3+1)*(2+1)-1(어떤것 하나는 무조건 걸쳐야함)
			 */
		}
		
		return result;
	}
	
}
