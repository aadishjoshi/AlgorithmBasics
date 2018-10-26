import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

class bfsMatrix{
	static int g[][];
	static boolean visited[];
	static Queue<Integer> q;

	public static void bfs(int start){
		int s;
		visited[start] = true;
		q.add(start);
		while(q.size() != 0){
			s = q.poll();
			System.out.print(" "+s);
			for(int i=0;i<5;i++){
				if(g[s][i] == 1 && visited[i] == false){
					visited[i] = true;
					q.add(i);
				}
			}

		}
	}

	public static void main(String args[]){
		g = new int [][]{
		  { 0, 1, 1, 1, 0},
		  { 1, 0, 0, 1, 1},
		  { 1, 0, 0, 0, 0},
		  { 1, 1, 0, 0, 0},
		  { 0, 1, 0, 0, 0}
		};
		visited = new boolean[5];
		q = new LinkedList<>();
		bfs(4);
	}
}