class Solution {
    static long answer = 0;
    static int[][] proArr;
    static int[] arr;
    public long solution(int n, int[][] products) {
       proArr=products;
        arr=new int[products.length];
        for(int i=0; i<products.length; i++){
            for(int j=0; j<products.length; j++){
             if(i!=j){
                 arr[i]+=products[j][1]*products[j][2];
             }
            }
        }
        dfs(n,0,products);
       
        
        return answer;
    }
    public static void dfs(int cnt, long sum,int[][] products){
         //System.out.println(cnt+" "+sum);
            
        if(cnt==0){
            answer=Math.max(answer, sum);
            return;
        }
       int[][] tmp=new int[products.length][3];
                for(int k=0; k<products.length; k++){
                    for(int z=0; z<3; z++){
                     tmp[k][z]=products[k][z];
                    }
                 }
        for(int i=0; i<products.length; i++){
             
            if(products[i][0]-products[i][2]*2>=0){//留ㅻ��뿉 �삱由� �긽�뭹
                
                tmp[i][0]=tmp[i][0]-tmp[i][2]*2;//�옱怨좊웾 諛붽퓞
                int notMade=0;               
                // for(int j=0; j<products.length; j++){//留ㅻ��뿉 �삱由ъ� �븡�� �긽�뭹
                //     if(i!=j){
                //         if(tmp[j][0]-tmp[j][2]>=0){
                //             notMade+=tmp[j][1]*tmp[j][2];
                //             //System.out.println(tmp[j][1]*tmp[j][2]);
                //             tmp[j][0]=tmp[j][0]-tmp[j][2];
                //         }
                //     }
                // }
                //System.out.println(cnt+" "+i+" "+sum);
                        
                dfs(cnt-1, sum+tmp[i][1]*tmp[i][2]*2+arr[i],tmp);
            }
        }
    }
}


