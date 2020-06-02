package com.programmers.level1.knumber;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * 지려버린 풀이
 * Point는 배열을 범위로 복사하는 'copyOfRange'
 *  public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
 *
 */


public class KNumber {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer=new int[commands.length];
        int pick=0;
        ArrayList<Integer> out=null;
        for(int i=0; i<commands.length;i++) {
        	for(int j=0; j<commands[i].length;j++) {
        		out=new ArrayList<>();
                int start=commands[i][0]-1;
        		int end=commands[i][1]-1;
        		pick=commands[i][2]-1;
        		for(int z=start; z<=end; z++) {
        			out.add(array[z]);
        		}
        		out.sort(null);
        		answer[i]=out.get(pick);
            	
        	}
        	
        }
        return answer;

    }
	public static void main(String[] args) {

		/**
		 * array[1,5,2,6,3,7,4] 
		 * command[[2,5,3],[4,4,1],[1,7,3]]
		 * return [5,6,3]
		 * [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
		 * 
		 */
		int[]array= {1,5,2,6,3,7,4};
		int[][]commands= {{2,5,3},{4,4,1},{1,7,3}};

		int out[]=solution(array, commands);
		for(int i=0; i<out.length; i++) {
			System.out.print(out[i]);
		}
	}

}
