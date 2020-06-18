package com.programmers.level1.kakao;
import java.util.*;

public class DollPick {
	    //테스트케이스 1,2 에서 에러
	    public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        ArrayList<Stack> qList=new ArrayList<>();
	        Stack<Integer> result=new Stack<>();
	        for(int i=0; i<board[0].length; i++){
	            Stack<Integer> stk=new Stack<>();
	            for(int j=board.length-1; j>=0; j--){
	                if(board[j][i]!=0){
	                    stk.push(board[j][i]);
	                }
	            }
	            qList.add(stk);
	            String tmp="";
	        }
	        for(int i=0; i<moves.length; i++){
	            Stack<Integer> tmp=qList.get(moves[i]-1);
	            int doll=0;
	            if(!tmp.isEmpty()){
	                doll=tmp.pop();
	            }
	            if(!result.isEmpty() && doll==result.peek()){
	                answer+=2;
	                result.pop();
	                System.out.println("pop: "+doll);
	            }else{
	                result.push(doll);
	                System.out.println("push: "+doll);
	            }
	        }//moves - for
	        
	        
	        return answer;
	    }
	}

