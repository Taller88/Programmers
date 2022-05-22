package com.programmers.level2.string;

public class StringCompression {

	public int solution(String s) {
		int answer = s.length();
        
        for(int i=1; i<=s.length()/2; i++) {
        	int result = compression(s, i);
        	answer = Math.min(answer, result);
        }
        return answer;
    }
	
	public static int compression(String s, int compression) {
		String result = "";
		int idx = 0;
		int cnt = 1;
		String cur ="";
		String target = s.substring(0, compression);
		for(int i=compression; i<=s.length(); i+=compression) {
			if(i+compression>s.length()) {
				cur = s.substring(i, s.length());				
			}else {
				cur = s.substring(i, i+compression);
				
			}
			
			if(cur.equals(target)) {
				cnt++;
			}else {
				result  += cnt==1? target:cnt+target;
				target = cur;
				cnt = 1;
			}
		}
		if(compression != target.length()) {
			result += target;
		}
		return result.length();
		
	}
	public static void main(String[]args) {
		StringCompression sc = new StringCompression();
		sc.solution("abcabcabcabcdededededede");
//		sc.solution("ababcdcdababcdcd");
		//abcabcabcabc6de : 2
		
	}
}
