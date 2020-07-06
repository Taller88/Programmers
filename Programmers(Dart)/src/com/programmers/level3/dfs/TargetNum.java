package com.programmers.level3.dfs;

public class TargetNum {
	
	static int result=0;
	public static  int solution(int[] numbers, int target) {
		int answer=0;
		boolean[] visited=new boolean[numbers.length];
		
		dfs(numbers,0,0,target);
		return result;
	}
	public static void dfs(int[] numbers, int start,int sum, int target) {
		if(sum==target &&start==numbers.length) {
			result++;
			return;
		}
		if(start==numbers.length) {
			return;
		}
		
		dfs(numbers,start+1,sum+numbers[start],target);
		dfs(numbers,start+1,sum-numbers[start],target);
		
	}
	public static void main(String []args) {
		int[] numbers= {1,1,1,1,1};
		System.out.println(solution(numbers, 3));
		
	}
}
