package com.programmers.level2.sense;

public class GoodSquare {

	public static void main(String[] args) {
	
		GoodSquare gs = new GoodSquare();
		long result = gs.solution(8, 12);
		System.out.println(result);
	}

	 public long solution(int w, int h) {
	        long answer = w*h;
	        float inclination = (float)h/(float)w;
//	        System.out.println(inclination);
	        float result = 0;
	        for(float i =0; i<w; i++) {
	        	for(float j = 0; j<h; j++) {
	        		result = (i*inclination)-j;
	        		if(-1<= result && result<1 ) {
//	        			System.out.println("x: "+i+" y: "+j+" ="+ ((i*inclination)-j));
//		        		if((i*inclination)-j == 1.0){
//		        			continue;
//		        		}
	        			answer--;
	        		}
	        	}
	        }
	        return answer;
	 }
	 
}
