package com.programmers.level2.completedSort;
import java.util.*;
public class BaseBall {
	public static boolean check(String test, String tmp, int strike, int ball) {
		int cStrike=0;
		int cBall=0;
		for(int i=0; i<test.length(); i++) {
			if(test.charAt(i)==tmp.charAt(i)) {
				cStrike++;
			}
			if(test.charAt(i)!=tmp.charAt(i) && tmp.contains(test.charAt(i)+"")){
				cBall++;
			}
		}
		return cStrike==strike && cBall==ball;
	}
	
	
	public static int solution(int[][]baseball) {
		int answer=0;
		Stack<Integer> stk=new Stack<>();
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				for(int z=1; z<10; z++) {
					if(i!=j && j!=z && i!=z) {
						String tmp=i+""+j+""+z;
						stk.push(Integer.parseInt(tmp));
					}
				}
			}
		}
		while(!stk.isEmpty()) {
			String test=String.valueOf(stk.pop());//숨겨진 수라고 가정
			boolean check=false;
			for(int i=0;i<baseball.length; i++) {
				boolean result=check(test, String.valueOf(baseball[i][0]), baseball[i][1], baseball[i][2]);
				check=result;
				if(!result) {
					break;
				}
			}
			if(check) {
				answer++;
			}
			
		}
		
		
		return answer;
	}
	
	public static void main(String[]args) {
		int[][]baseball= {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
		System.out.println(solution(baseball));
//		System.out.println(check("123", "123", 3, 0));
		
	}
}
