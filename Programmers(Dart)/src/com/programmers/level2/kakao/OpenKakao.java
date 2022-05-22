package com.programmers.level2.kakao;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenKakao {

	 public String[] solution(String[] record) {
		 	String[] answer = {};
	        	
		 	ArrayList<String> arr = new ArrayList<String>();
		 	
	        HashMap<String, String> enterMap= new HashMap<String, String>(); 
	        for(int i = 0; i<record.length; i++) {
	        	String[] el = record[i].split(" ");
	        	String command = el[0];
	        	String id = el[1];
	        	
	        	if(command.equals("Enter")) {
		        	String nick = el[2];

	        		arr.add(id+"님이 들어왔습니다.");
	        		enterMap.put(id, nick);
	        	}else if(command.equals("Change")) {
		        	String nick = el[2];

	        		enterMap.put(id, nick);
	        	}else{// Leave
	        		arr.add(id+"님이 나갔습니다.");   		
	        	}
	        	
	        }
	        answer = new String[arr.size()];
	        for(int i = 0; i<arr.size(); i++) {
	        	int idx = arr.get(i).indexOf("님이 ");
	        	String id = arr.get(i).substring(0, idx);
	        	String text = arr.get(i).substring(idx);
	        	
	        	answer[i]=enterMap.get(id)+text;
	        }
	        
	        return answer;
	    }
	 
	public static void main(String[]args) {
		OpenKakao ok = new OpenKakao();
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String [] result = ok.solution(record);
		
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
