package com.programmers.level3.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class GraphEdit {

	public static void main(String[] args) {
		GraphEdit ge = new GraphEdit();
		int n = 8;
		int k = 2;
		String[] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
		String result = ge.solution(n, k, cmd);
		System.out.println("result: "+ result);
	}
	
	
	public String solution(int n, int k, String[] cmd) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer[]> stack = new Stack<Integer[]>();
        for(int i =0; i<n; i++) {
        	list.add(i);
        }
        
        int idx = k;
        
        for(int i=0; i<cmd.length; i++) {
        	String[] op = cmd[i].split(" ");
        	String operation = op[0];
//        	System.out.println("idx: "+idx+" list.size():"+ list.size());
        	if(operation.equals("U")) {
        		int move = Integer.parseInt(op[1]);
        		idx = 0>idx-move?0:idx-move;
        		
        	}else if(operation.equals("D")) {
        		int move = Integer.parseInt(op[1]);
        		idx = n<=idx+move?n-1:idx+move;
        		
        		
        	}else if(operation.equals("C")) {
        		Integer[] arr = {idx, list.get(idx)};
        		list.remove(idx);
        		if(idx==list.size()-1) {
        			idx--;
        		}
        		stack.add(arr);
        	}else if(operation.equals("Z")) {
        		Integer[] arr = stack.pop();
        		list.add(arr[0], arr[1]);
        		if(arr[0]<=idx) {
        			idx++;
        		}
        	}
        }
        
        idx =0;
        System.out.println("====================================");
        for(int v : list) {
        	System.out.println(((idx++))+" "+v);
        }
        System.out.println("====================================");

        int arrIdx =0;
        for(int i=0; i<n; i++) {
        	if(i == list.get(arrIdx)) {
        		answer+="O";
        		arrIdx++;
        	}else {
        		answer+="X";        		
        	}
        }
        return answer;
    }

}
