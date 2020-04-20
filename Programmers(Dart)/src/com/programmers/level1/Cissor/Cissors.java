package com.programmers.level1.Cissor;

public class Cissors {
	
	/**
	 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
	 * 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. 
	 * z는 1만큼 밀면 a가 됩니다. 
	 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

	* 제한 조건
	공백은 아무리 밀어도 공백입니다.
	s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
	s의 길이는 8000이하입니다.
	n은 1 이상, 25이하인 자연수입니다.
	 */
	
	
	public static void main(String[] args) {
		String a="Zsdv";
		System.out.println(solution(a, 5));
		
		
		System.out.println("what: "+(char)('a'+5));
		
		System.out.println('z'+0);
		System.out.println('Z'+0);
		
		
	
	}

	  public static String solution(String s, int n) {
		 	String answer="";
				for(int i=0; i<s.length(); i++) {
					//A: 65
					//Z: 90
					//대문자: 65~95
					
					//a: 97
					//z: 122
					//소문자: 97~122
					
					//공백: 32
					if(s.charAt(i)>=65 && s.charAt(i)<=90) {//대문자
						if(s.charAt(i)+n>90) {//더한 값이 Z보다 큰경우
							answer+=(char)('A'+s.charAt(i)+n-90-1);
						}else {
							answer+=(char)(s.charAt(i)+n);
						}
						
						
					}else if(s.charAt(i)>=97 && s.charAt(i)<=122)  {//소문자
						
						
						if(s.charAt(i)+n>122) {//더한 값이 Z보다 큰경우
							answer+=(char)('a'+s.charAt(i)+n-122-1);
						}else {
							answer+=(char)(s.charAt(i)+n);
						}
						
					}else if(s.charAt(i)==' ') {//띄어쓰기
						answer+=' ';
					}
					
					
					
					
				}//for
				
				
				
				return answer;
			}

}
