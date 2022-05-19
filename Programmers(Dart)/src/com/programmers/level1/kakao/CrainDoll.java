package com.programmers.level1.kakao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CrainDoll {

	public static void main(String[] args) {
		CrainDoll cd = new CrainDoll();
		int[][] board =  {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int result = cd.solution(board, moves);
		System.out.println(""+result);

	}

	public int solution(int[][] board2, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        int before = 0;
        int[][] board = board2;
        for(int i = 0; i<moves.length; i++) {
        	int idx =moves[i]-1;
        	for(int j=0; j<board[idx].length; j++) {
        		if(board[j][idx]!=0) {
        			if(stack.size()>0 && stack.peek()== board[j][idx]) {
        				stack.pop();
        				answer+=2;
        				before=0;
        			}else {
            			before= board[j][idx];
            			stack.push(board[j][idx]);
        			}
        			board[j][idx]=0;
        			break;
        		}
        	}
        }
        return answer;
    }
	
}
