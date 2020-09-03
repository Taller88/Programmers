package com.programmers.level3;

public class TresureIsland {

    public int solution(int[] money) {
        int answer = 0;
        int[]dp=new int[money.length];
        dp[0]=money[0];
        dp[1]=money[1];
        
        for(int i=2; i<money.length; i++){
            dp[i]=money[i]+dp[i-2];
        }
        
        int idx=money.length-1;
        answer=Math.max(dp[idx],dp[idx-1]);
        return answer;
    }

}
