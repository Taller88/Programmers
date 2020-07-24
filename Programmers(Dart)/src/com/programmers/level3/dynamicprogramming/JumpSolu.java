package com.programmers.level3.dynamicprogramming;

public class JumpSolu {
	public static long solution(int n) {
        long answer = 0;
        long[] dp=new long[2001];
        dp[1]=1;
        dp[2]=2;
        for(int i=3 ; i<2001; i++){
            dp[i]=(dp[i-1]+dp[i-2])%1234567;
            if(i==n){
                break;
            }
        }
        return dp[n];
    }


	public static void main(String[] args) {
		System.out.println(solution(2000));
	}

}
