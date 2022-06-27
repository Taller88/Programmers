package com.programmers.level3.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Island {

	public static void main(String[] args) {
		Island is = new Island();
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		int result = is.solution(4,costs);
		System.out.println("result: "+ result);
		
	}

	static int temp = Integer.MAX_VALUE;
	static int arr[]=null;
	 public int solution(int n, int[][] costs) {
	        int answer = 0;
	        
	        Arrays.sort(costs, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					Integer a = o1[2];
					Integer b = o1[2];
					return a.compareTo(b);
				}
			});
	        
	        arr = new int[n];
	        for(int i =0; i<n; i++) {
	        	arr[i]=i;
	        }
	        
	        for(int i = 0; i<costs.length; i++) {
	        	int a = findParent(costs[i][0]);
	        	int b = findParent(costs[i][1]);
	        	if(a!=b) {
	        		arr[b]=a;
	        		answer+=costs[i][2];
	        	}
	        }
	        
	        return answer;
	 }

	 public static int findParent(int x) {
		 if(arr[x]==x) {
			 return x;
		 }
		 return arr[x] = findParent(arr[x]);
		 
	 }

}
