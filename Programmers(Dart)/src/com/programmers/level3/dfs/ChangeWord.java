package com.programmers.level3.dfs;

public class ChangeWord {

	public static int solution(String begin, String target, String[] words) {
		boolean check=false;
		boolean[] visited=new boolean[words.length];
		for(int i=0; i<words.length; i++) {
			if(words[i].equals(target)) {
				check=true;
				break;
			}
		}
		if(!check) {
			return 0;
		}
		System.out.println(begin);
		int answer=dfs(words,begin,0,0,target,visited);
		
		return answer;
	}
	public static boolean compare(String a, String b) {
		String arr[]=a.split("");
		String brr[]=b.split("");
		boolean result=false;
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].equals(brr[i])) {
				cnt++;
			}
		}
		return (cnt!=1)?false:true;
		
	}
	public static int dfs(String[] words, String begin,int idx, int cnt, String target, boolean[] visited) {
		int answer=51;
		if(target.equals(begin)) {
			if(answer>cnt) {
				answer=cnt;
			}
			System.out.println("답: "+begin+" cnt:"+cnt);
			System.out.println();
			return answer;
		}
		if(words.length<=cnt) {
			return cnt;
		}
		System.out.println(cnt);
		for(int i=0; i<words.length; i++) {
			if(compare(begin, words[i])&&!visited[i]) {
				System.out.println(begin+"->"+words[i]);
				visited[i]=true;
				//cnt++; : 밑에 cnt+1 해주면 되고 이건 안됨 
				int tmp=dfs(words, words[i], i,cnt+1, target, visited);
				System.out.println("tmp: "+tmp +" begin: "+begin);
				visited[i]=false;
				if(tmp<answer) {
					answer=tmp;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String begin="hit";
		String target="cog";
		String[]words= {"hot", "dog","dot" , "lot", "log", "cog"};
		
		System.out.println("answer: "+solution(begin, target, words));
	}

}
