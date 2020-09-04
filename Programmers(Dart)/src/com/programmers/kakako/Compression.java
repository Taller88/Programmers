package com.programmers.kakako;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Compression {

	 public static int[] solution(String msg) {
	    int[] answer = {};
	    ArrayList<Integer> list=new ArrayList<>();
	    HashMap<String,Integer> map=new HashMap<>();
	    char in='A';
	    for(int i=0; i<'Z'-'A'+1; i++) {
	    	map.put(String.valueOf((char)(in+i)), i+1);
	    }
	    int v=27;
	    StringBuilder sb=new StringBuilder();
	    for(int i=0; i<msg.length(); i++) {
	    	sb.append(msg.charAt(i));
	    	if(!map.containsKey(sb.toString())) {
	    		map.put(sb.toString(), ++v);
	    		sb.setLength(sb.length()-1);
	    		list.add(map.get(sb.toString()));
	    		sb.setLength(0);
	    		i--;
	    	}
	    }
	    if(sb.length()>0) {
	    	list.add(map.get(sb.toString()));
	    }
	    answer=new int[list.size()];
	    for(int i=0; i<list.size(); i++) {
	    	answer[i]=list.get(i);
	    }
	    return answer;
	 }
	public static void main(String[] args) {
		int[] arr=solution("KAKAO");
		for(int a: arr) {
			System.out.println(a);
		}
//		 for(String key: map.keySet()) {
//		    	System.out.println(key+" "+map.get(key));
//		 }
	}

}
