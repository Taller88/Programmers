package com.programmers.level2.sense;

import java.util.Arrays;
import java.util.HashMap;

public class MenuRenuel {
	public static void main(String[]args) {
		MenuRenuel mr = new MenuRenuel();
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,5};
		
		String[] result = mr.solution(orders, course);
		
	}
	static HashMap<String ,Integer> map = new HashMap<>();
	
	public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<course.length; i++) {
			int combiLen = course[i];
			
			for(int j=0; j<orders.length; j++) {
				char[] arr = orders[i].toCharArray();
				Arrays.sort(arr);
				combination(arr,"", 0, combiLen);
			}
		}
		System.out.println(map.size());
        
        return answer;
    }
	private void combination(char[] orders,String result ,int idx, int combiLen) {
		if(result.length()== combiLen) {
			System.out.println(combiLen +": "+result);

			map.put(result, map.getOrDefault(result, 0)+1);
			return;
		}
		for(int i=idx; i<orders.length; i++) {
			combination(orders, result+orders[i], idx+1, combiLen);
		}
		return;
	}

}
