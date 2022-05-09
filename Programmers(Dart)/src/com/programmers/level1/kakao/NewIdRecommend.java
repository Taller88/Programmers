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
