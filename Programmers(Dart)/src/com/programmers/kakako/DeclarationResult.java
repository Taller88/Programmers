package com.programmers.kakako;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DeclarationResult {

	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> idxMap = new HashMap<String, Integer>();
        Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
        for(int i = 0; i<id_list.length; i++) {
        	map.put(id_list[i], new HashSet<String>());
        	idxMap.put(id_list[i], i);
        }
        for(int i = 0; i<report.length; i++) {
        	String[] userArr = report[i].split(" ");
        	String user = userArr[0];
        	String declared= userArr[1];
        	map.get(declared).add(user);
        	
        }
        
        
        for(int i = 0; i<id_list.length; i++) {
        	if(k<=map.get(id_list[i]).size()) {
        		for(String name:map.get(id_list[i])) {
        			answer[idxMap.get(name)]++;
        		}
        	}
        	
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		DeclarationResult test = new DeclarationResult();
		String[] a = {"muzi", "frodo", "apeach", "neo"};
		String[] b = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		int[] result = test.solution(a, b, 2);
		String resultStr = "";
		for(int i =0; i<result.length; i++) {
			resultStr+=result[i]+" ";
		}
		System.out.println(resultStr);
		
	}

}
