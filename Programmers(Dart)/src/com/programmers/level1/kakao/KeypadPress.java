package com.programmers.level1.kakao;

public class KeypadPress {

	public static void main(String[] args) {
		KeypadPress keypad = new KeypadPress();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String result = keypad.solution(numbers, "right");

		System.out.println(result);
	}
//	13458214595
//	LRLLLRLLRRL
//	LRLLLRLLRRL
//	LRLRRRLLRRR
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftIdx = 10;
        int rightIdx = 12;
        
        for(int i = 0; i<numbers.length; i++) {
        	if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7 ) {//왼쪽
        		leftIdx = numbers[i];
        		answer+="L";
        	}else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9 ) {// 오른쪽
        		rightIdx = numbers[i]; 
        		answer+="R";
        	}else {
        		int leftDis = getDistance(leftIdx, numbers[i]);
        		int rightDis = getDistance(rightIdx, numbers[i]);
        		if(leftDis==rightDis) {
        			if(hand.equals("right")) {
        				answer+="R";
        				rightIdx = numbers[i];
        			}else {
        				leftIdx = numbers[i];
        				answer+="L";
        			}
//        			answer += hand.equals("right")?"R":"L";
        			
        		}else if(leftDis>rightDis) {
        			rightIdx = numbers[i];
        			answer += "R";        			
        		}else if(leftDis<rightDis) {
        			leftIdx = numbers[i];
        			answer += "L";
        		}
        	}
        }
        return answer;
    }
	public int getDistance(int from, int to) {
		if(from == 0) {
			from =11;
		}
		if(to== 0) {
			to =11;
		}
		
		int distance = 0;
		int fromX = (from-1)%3;
		int fromY = (from-1)/3;
		int toX = (to-1)%3;
		int toY = (to-1)/3;
		
		return Math.abs(fromX-toX)+Math.abs(fromY-toY);
		
	}
}
