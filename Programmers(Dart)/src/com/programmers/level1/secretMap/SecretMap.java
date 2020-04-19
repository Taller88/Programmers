package com.programmers.level1.secretMap;

public class SecretMap {

	
	public static void main(String[] args) {
//	int n=5;
//	int[]arr1= {9, 20, 28, 18, 11};
//	int[]arr2= {30, 1, 21, 17, 28};
	
//	int n=6;
//	int[]arr1= {46, 33, 33 ,22, 31, 50};
//	int[]arr2= {27 ,56, 19, 14, 14, 10};
//	0 0 0 0 0 이랑 30 1 21 17 28	
	int n=5;
	int[]arr1= {0,0,0,0,0};
	int[]arr2= {30, 1, 21, 17, 28};

	String dap[]=solution(n,arr1,arr2);
		for(int i=0; i<dap.length; i++) {
			System.out.println(dap[i]);
		}
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[]answer= new String[n];
		String[]firMap=new String[arr1.length];
		String[]secMap=new String[arr2.length];
		
		//비교를 위해 이진법으로
		for(int i=0; i<arr1.length;i++) {
			//좀 지저분하지만 이진법으로 바꾸고 String.format을 써서 빈공간에 0을 채워주기 위해 다시 parseint사용
			firMap[i] = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
			secMap[i]=String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
			
			System.out.println(i+"="+firMap[i]);
			System.out.println(i+"="+secMap[i]);

		}
		for(int i=0; i<arr2.length;i++) {
			
		}
		for(int i=0; i<arr1.length;i++) {
			answer[i]="";
			for(int j=0; j<firMap[i].length();j++) {
				if(firMap[i].charAt(j)=='1' || secMap[i].charAt(j)=='1') {
					answer[i]+="#";
				}else {
					answer[i]+=" ";
				}
			}
		}
		
		return answer;
	}

}
