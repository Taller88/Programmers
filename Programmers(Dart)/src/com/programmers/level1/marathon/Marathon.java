package com.programmers.level1.marathon;

public class Marathon {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        boolean check=true;
        //우선 달린 사람을 체크한다.
        for(int i=0; i<participant.length; i++) {
        	for(int j=0; j<completion.length; j++) {
        		//달린사람과 완주자들을 체크한다.
            	check=true;
        		if(participant[i].equals(completion[j])){
        			check=false;
        			completion[j]="0";
        			break;
        		}
        	
        	}
        	if(check) {//달린사람과 완주자를 비교했을때 같은 이름이 없으면 
        				//answer에 달린사람의 이름을 넣는다
    			answer=participant[i];
    	
    		}
        }
        
        return answer;
        //정답은 일치하지만 효율성 Check 불통
    }
	
	public static void main(String[] args) {
		
		//String[] participant={"leo", "kiki", "eden"};
		//String[] completion={"eden", "kiki"};
		
		//String[] participant={"marina", "josipa", "nikola", "vinko", "filipa"};
		//String[] completion={"josipa", "filipa", "marina", "nikola"};
		
		String[] participant= {"qw","we","er","qw"};
		String[] completion= {"er","qw","er"};
		
		//정답: "leo"
		System.out.println(solution(participant,completion ));
	}

}
