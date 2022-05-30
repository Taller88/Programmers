package com.programmers.level2.sense;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MenuRenuel {

	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		MenuRenuel mr = new MenuRenuel();
		String[] result = mr.solution(orders, course);
		for(int i =0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
//"AC", "ACDE", "BCFG", "CDE"
	}
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static int intMaxSize = Integer.MAX_VALUE;
	static int intMinSize = Integer.MIN_VALUE;
	
	public String[] solution(String[] orders, int[] course) {
		String[] answer = {};
		ArrayList<String> result = new ArrayList<String>();
		for(int i = 0 ; i<course.length; i++) {
			int combiLen = course[i];
			map = new HashMap<String, Integer>();
			intMinSize = Integer.MIN_VALUE;
//			System.out.println(combiLen);
			for(int j=0; j<orders.length; j++) {
				char[] arr = orders[j].toCharArray();
				Arrays.sort(arr);
//				System.out.println(combiLen+": "+orders[i]);
				combination(arr, combiLen, 0, "",0);
			}
			for(String key: map.keySet()) {
				int obj = map.get(key);
				if(obj>intMinSize) {
					intMinSize = obj;
				}
			}
			for(String key: map.keySet()) {
				int obj = map.get(key);
				if(intMinSize>=2 && obj == intMinSize) {
					result.add(key);
				}
			}
		}

		answer = new String[result.size()];
		for(int i =0; i<result.size(); i++) {
			answer[i] = result.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}


	private void combination(char[] arr, int combiLen, int cnt, String result, int currentIdx) {
		if(combiLen  == cnt) {
			map.put(result, map.getOrDefault(result, 0)+1);
			return;
		}
		
		for(int i = currentIdx; i<arr.length; i++) {
			combination(arr, combiLen, cnt+1, result+arr[i], i+1);
		}

		
	}

}

