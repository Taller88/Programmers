package com.programmers.level1.primeNum;

public class PrimeNum {

	 public static int solution(int[] n) {
		 int answer = -1;
		 boolean[] visited = new boolean[n.length];
		 dfs(n, visited, 0,0);
		 
		 answer = count;
		 return 0;
	 }

	private static void dfs(int[] n, boolean[] visited, int num, int cnt) {
		if(cnt==3) {
			if(isPrime(num)) {
				count++;
				System.out.println(num +" count: "+count);
				
				return;
			}
		}
		System.out.println(num);
		for(int i=0; i<n.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(n,visited, num+n[i], cnt+1);
				visited[i] = false;
			}
		}
	}

	static int count = 0;
	public static boolean isPrime(int num) {
		boolean check = true;
		
		for(int i =2; i<num ; i++) {
			if(num%i==0) {
				check = true;
				break;
			}
		}
		return check;
			
	}
	public static void main(String[] args) {
		PrimeNum pn = new PrimeNum();
		int[] num = {1,2,3,4};
		int result = pn.solution(num);
		System.out.println("result: "+result);
		System.out.println(isPrime(7));
		
	}

}
