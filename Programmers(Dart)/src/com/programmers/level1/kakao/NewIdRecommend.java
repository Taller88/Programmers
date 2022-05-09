package com.programmers.level1.kakao;

public class NewIdRecommend {

	public static void main(String[] args) {
		char test = '*';
        System.out.println(test-0);
		NewIdRecommend newId = new NewIdRecommend();
		newId.solution("abcdefghijklmn.p"	);
				
	}
	/**
	 * 아이디 3자이상~15자이상
	 * 처음과 끝에 .사용불가 연속사용불가
	 * -_. 알파벳 소문자만
	 * @param new_id
	 * @return
	 */
	public String solution2(String new_id) {
        String answer = new_id.toLowerCase();
        char[]arr = answer.toCharArray();
        		
        String temp = "";
        for(int i = 0; i<arr.length; i++) {
        	if(!((arr[i]>=97 &&arr[i]<=122)||arr[i]==77 ||arr[i]==46 ||arr[i]==95)) {
        		arr[i] = ' ';
        	}
        }
        
        answer = "";
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i]!= ' ') {
            	answer+=arr[i]+"";        		
        	}
        }
        if(answer == "") {
        	answer = "a";
        }
        while(answer.contains("..")) {
        	answer = answer.replace("..", ".");
        }
        
        if(answer.startsWith(".")) {
        	answer = answer.substring(1);	
        }
        if(answer.endsWith(".")) {
    		answer = answer.substring(0, answer.length()-1);
    	}
              
        if(answer.length()>=16) {
        	answer = answer.substring(0, 15);
            if(answer.endsWith(".")) {
        		answer = answer.substring(0, answer.length()-1);
        	}
        	
        }
        
        while(answer.length()<3) {
        	answer+=answer.charAt(answer.length()-1);
        }

        return answer;
    }
	public String solution(String new_id) {
        String answer = new_id.toLowerCase(); // 1단계

        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2단계
        answer = answer.replaceAll("[.]{2,}", "."); // 3단계
        answer = answer.replaceAll("^[.]|[.]$", "");    // 4단계
        
        if (answer.equals("")) {    // 5단계
            answer += "a";
        }

        if (answer.length() >= 16) {     // 6단계
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }

        if (answer.length() <= 2) {  // 7단계
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }
}
