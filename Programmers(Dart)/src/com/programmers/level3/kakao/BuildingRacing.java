package com.programmers.level3.kakao;
import java.util.*;

public class BuildingRacing {

	    static int[] dx={1,-1,0,0};
	    static int[] dy={0,0,1,-1};
	    static int min=0;
	 public static int solution(int[][] board) {
	        
	        min=500*board.length*board.length;
	        boolean[][]visited=new boolean[board.length][board[0].length];
	        bfs(board,0,0,visited);
	        
	        return min;
	 }
	    static class Node implements Comparable<Node>{
	        int x;
	        int y;
	        int cost;
	        int check;
	        boolean[][]visited;
	        public Node(int x, int y, int cost, int check, boolean[][]visited){
	            this.x=x;
	            this.y=y;
	            this.cost=cost;
	            this.check=check;
	            this.visited=visited;
	        }
	        @Override
	        public int compareTo(Node o){
	            return this.cost-o.cost;
	        }
	    }
	    public static void bfs(int[][] board, int h, int w,boolean[][]visited){
	        PriorityQueue<Node> q=new PriorityQueue<Node>();
	         visited[h][w]=true;
	        q.add(new Node(h,w,0,-1, visited));
	       
	        while(!q.isEmpty()){
	            Node n=q.poll();
	            
	            int x_=0;
	            int y_=0;
	            System.out.println(n.x+" : "+n.y+" n.cost: "+n.cost+" n.check: "+n.check);
	            if(n.x==board.length-1&& n.y==board[0].length-1){
	                min=n.cost;
	                break;   
	            }
	            for(int i=0; i<4; i++){
	                x_=n.x+dx[i];
	                y_=n.y+dy[i];
	                if(x_>=0 && y_>=0 && x_<board.length && y_<board[0].length){
	                    
	                if(!n.visited[x_][y_] && board[x_][y_]==0){
	                    n.visited[x_][y_]=true;
	                     

	                    if(n.check==i||n.check==-1){//직선도로 혹은 첫번째 도로
	                         q.add(new Node(x_, y_,n.cost+100,i,n.visited));
	                    }else if(n.check!=i){//코너도로
	                         q.add(new Node(x_, y_,n.cost+600,i,n.visited));
	                    }//둘다 가로
	                 }
	             }
	                
	            }//for
	            
	        }//while
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
