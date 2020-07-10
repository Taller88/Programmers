package com.programmers.level2.dp;

public class Fibo {
	    static int sum;
	    static long[] dp;
	    public static long recrusion(int n){
	    	System.out.println(n+": "+dp[n]);
	    	if(n==0){
	            dp[0]=0;
	            return 0;
	        }
	        if(n==1){
	            dp[1]=1;
	            return 1;
	        }
	        if(dp[n]==0){
	              dp[n]=recrusion(n-1)+recrusion(n-2);
	        }else {
	        	System.out.println("dp["+n+"]: "+dp[n]);
	        	return dp[n];
	        }
	        return dp[n];
	        
	      
	             
	    }
	    
	    public static long solution(int n) {
	        long answer = 0;
	        dp=new long[n+1];
	        sum=0;
	        if(n<2) {
	        	answer=recrusion(n);
	        }else {
		        answer=recrusion(n)%1234567;
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		System.out.println(solution(100));
		int answer=(int) recrusion(100);
	}

}
