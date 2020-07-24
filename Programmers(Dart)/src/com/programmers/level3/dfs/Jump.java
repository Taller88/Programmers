package com.programmers.level3.dfs;

public class Jump {

    static long answer = 0;
    public static long solution(int n) {
    	dfs(n, 0);
    	return answer%1234567;
    }
    

    public static void dfs(int n, int cu){
    	if(cu==n){
    		answer++;
    		return;
    	}
		if(cu>n){
		    return;
		}
		dfs(n,cu+1);
		dfs(n,cu+2);
    
}

	public static void main(String[] args) {
		System.out.println(solution(2000));
		
	}

}
