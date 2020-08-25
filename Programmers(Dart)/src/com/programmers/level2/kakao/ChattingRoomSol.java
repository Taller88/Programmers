package com.programmers.level2.kakao;

import java.util.ArrayList;
import java.util.HashMap;

public class ChattingRoomSol {

	
	
	
	public static String[] solution(String[] record) {
		String[] answer = {};
		HashMap<String, String> map=new HashMap<>();
    	for(int i=0; i<record.length; i++) {
    		String[] tmp=record[i].split(" ");
    		if(tmp[0].equals("Enter") || tmp[0].equals("Change") ) {
    			map.put(tmp[1], tmp[2]);
    		}
		}
    	ArrayList<String> list=new ArrayList<>();
    	for(int i=0; i<record.length; i++) {
    		String[] tmp=record[i].split(" ");
    		if(tmp[0].equals("Enter")) {
    			list.add(map.get(tmp[1])+"님이 들어왔습니다.");
    		}
    		if(tmp[0].equals("Leave")) {
    			list.add(map.get(tmp[1])+"님이 나갔습니다.");
    		}
    	}
    	answer=new String[list.size()];
    	for(int i=0; i<list.size(); i++) {
    		answer[i]=list.get(i);
    	}
	return answer;
	}
	public static void main(String[] args) {
		String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer=solution(record);
		for(String a: answer) {
			System.out.println(a);
		}
	}

}
