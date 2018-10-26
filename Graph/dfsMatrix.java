/********************************************************************************************************************************************
* Depth First Search Stack Implementation in Java
* Written by :- Aadish Joshi
*********************************************************************************************************************************************/

import java.util.*;
import java.io.*;
import java.util.Stack;

class dfsMatrix{
	static int g[][];
	static boolean visited[];
	static Stack<Integer> stack;

	static void dfs(int start){
		int s,m;
		stack.push(start);

		while(!stack.isEmpty()){
			int i=0;
			s = stack.peek();
			visited[s] = true;
			while(i<5){
				if(g[s][i] == 1 && visited[i] == false){
					stack.push(i);
					break;
				}
				i++;
				if(i == 5){
					m = stack.pop();
					System.out.print(" "+m);
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
		stack = new Stack<>();
		dfs(4);
	}

}

