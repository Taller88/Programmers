package com.programmers.level2.que;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
 
class functionDev {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<Integer>();
        /**
         * 먼저 기능개발까지 남은 날짜들을 Queue에 저장한다. 
         */
        for(int i = 0; i < progresses.length; i++) {
            q.add((100-progresses[i])%speeds[i] == 0? (100 - progresses[i]) / speeds[i]
                    : (100 - progresses[i]) / speeds[i] + 1);
        }
        
        List<Integer> result = new ArrayList<Integer>();
        //가장 먼저 저장된 element를 standard로 저장
        int standard = q.poll();
        //한번에 배포할 기능의 개수
        int cnt = 1;
        while(!q.isEmpty()) {
        	//비교를 위해 그 다음 element를 deQue
            int num = q.poll();
            if(standard >= num) {
            	//기준으로 잡은 standard보다 num이 크면 다음꺼까지 제크하기 위해 넘어감
            	
                cnt++;
            }else {
                System.out.println(cnt);
                result.add(cnt);
                //cnt 초기화 해주고 standard값도 그 다음 값으로 초기화
                cnt = 1;
                standard = num;
            }
        }
        System.out.println(cnt);
        result.add(cnt);
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}