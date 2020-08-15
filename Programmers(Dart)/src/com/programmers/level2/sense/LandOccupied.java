package com.programmers.level2.sense;

public class LandOccupied {
    static int max=0;
    public static int[] findMax(int[] land, int exceptIdx){
        int max=0;
        int maxIdx=0;
        for(int i=0; i<land.length; i++){
            if(exceptIdx!=i && max<land[i]){
                max=land[i];
                maxIdx=i;
            }
        }
        int[] result=new int[2];
        result[0]=max;
        result[1]=maxIdx;
        
        return result;
    }
    public static int solution(int[][] land) {
        int tmp=0;
        
        for(int i=0; i<land[0].length; i++){
            dfs(land,i,land[0][i],1);
        }

        return max;
    }
    public static void dfs(int[][] land, int idx, int sum, int cnt){
        // System.out.println("idx: "+idx+" sum:"+sum+" cnt:"+cnt);
        if(cnt==land.length){
            if(sum>max){
                max=sum;
                // System.out.println("max: "+max);
            }
            return;
        }
        
        if(cnt>land.length){
            return;
        }
        int[] temp=findMax(land[cnt],idx);
        dfs(land, temp[1], sum+temp[0],cnt+1);
        // for(int i=0; i<land[cnt].length; i++){
        //     if(i!=idx){
        //         dfs(land, i, sum+land[cnt][i],cnt+1);
        //     }
        // }
    }
	public static void main(String[] args) {
		int[][]land= {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution(land));
	}

}
