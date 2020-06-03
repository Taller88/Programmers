package com.programmers.level2.stack;

public class StockPrice {
	/**
	 * 종한씨 Python 코드 참고 (Stack안쓴 내용)
	 * @param prices
	 * @return
	 */
	public static int[] solution(int []prices) {
		int[] answer= new int[prices.length];
		for(int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length; j++) {
				answer[i]+=1;
				if(prices[i]>prices[j]) {
					break;
				}
			}
		}
		
		return answer;
		
	}
	public static void main(String args[]) {
		int []prices={1,2,3,2,3};
		int [] result=solution(prices);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+",");
		}
	}
}
