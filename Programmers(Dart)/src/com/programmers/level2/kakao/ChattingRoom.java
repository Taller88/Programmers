package com.programmers.level2.kakao;

import java.util.ArrayList;
import java.util.HashMap;

public class ChattingRoom {
	
	    public static String[] solution(String[] record) {
	        String[] answer = {};
	        HashMap<String, String> map=new HashMap<>();
	        ArrayList<String[]> list=new ArrayList<>();
	        
	        for(int i=0; i<record.length; i++){
	            String[] arr=record[i].split(" ");
	            if(arr[0].equals("Enter")){
	            		for(int j=0; j<list.size(); j++) {
		                	if(list.get(j)[1].equals(arr[1])) {
		                		String tmp=list.get(j)[0].substring(0,list.get(j)[0].indexOf("님"));
//		                		System.out.println(tmp);
		                		list.set(j,new String[] {list.get(j)[0].replace(tmp,arr[2]),arr[1]});
		                	}
		                }
	            		map.put(arr[1],arr[2]);
	            		list.add(new String[]{arr[2]+"님이 들어왔습니다.",arr[1]});
	            }else if(arr[0].equals("Leave")){
	                list.add(new String[] {map.get(arr[1])+"님이 나갔습니다.",arr[1]});
	                map.remove(arr[1]);
	            }else if(arr[0].equals("Change")){
	            	String rem=map.replace(arr[1],arr[2]);
	            	for(int j=0; j<list.size(); j++) {
	            		if(list.get(j)[1].equals(arr[1])) {
	            			list.set(j,new String[] {list.get(j)[0].replace(rem, arr[2]),arr[1]});
	                	}
	            	}
	            }
	                
	        }
	        answer=new String[list.size()];
	        for(int i=0; i<answer.length; i++) {
	        	answer[i]=list.get(i)[0];
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
