package com.programmers.level1.primeNum;

public class PrimeNum {

	 public static int solution(int n) {
//	      int answer = 0;
//	      boolean check=true;
//	      for(int i=2; i<=n; i++) {
//	    	  if(i%2==0) {
//	    		  continue;
//	    	  }
//	    	  for(int j=2; j<i; j++) {
//	    		  check=true;
//	    	      System.out.println(i+"%"+j+"="+(i%j==0));
//	    			 
//	    		  if(i%j==0) {
//	    			  check=false;
//	    			  break;
//	    		  }
//	    	  }
//	    	  
//	    	  if(check) {
//	    		  System.out.println(i);
//	    		  answer++;
//	    	  }
//	    	  
//	    	  
//	      }
//	      return answer;
//	  }
		   int answer = 0;
	          
	          int[] number = new int[n+1];
	          
	          //2부터 n까지의 수를 배열에 넣는다.
	          for(int i=2; i<=n; i++) {
	              number[i] = i;
	          }
	          
	          //2부터 시작해서 그의 배수들을 0으로 만든다.
	          //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
	          for(int i=2; i<=n; i++) {
	              if(number[i]==0) continue;
	              
	              for(int j= 2*i; j<=n; j += i) {
	                  number[j] = 0;
	              }
	          }
	          
	          //배열에서 0이 아닌 것들의 개수를 세준다.
	          for(int i=0; i<number.length; i++) {
	              if(number[i]!=0) {
	                  answer++;
	              }
	          }
	          
	          return answer;
	      }

		 public static void main(String[] args) {
		System.out.println("result:"+solution(10));
	}

}
