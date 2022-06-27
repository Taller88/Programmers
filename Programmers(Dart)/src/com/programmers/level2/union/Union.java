package com.programmers.level2.union;

public class Union {

	public static void main(String[] args) {
		int n = 7;
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		unionParent(arr, 0,1);
		unionParent(arr, 1,2);
		unionParent(arr, 2,3);
		unionParent(arr, 4,5);
		unionParent(arr, 5,6);
		
		
		System.out.println(getParent(arr, 6));
		
	}
	
	
	public static int getParent(int[] arr, int x) {
		if(x== arr[x]) {
			return x;
		}
		return arr[x]=getParent(arr, arr[x]);
	}
	
	public static void unionParent(int[] arr, int x, int y) {
		int a = getParent(arr, x);
		int b = getParent(arr, y);
		
		if(a<b) {
			arr[y]= a;
		}else {
			arr[x] = b;
		}
		
	}
	

}
