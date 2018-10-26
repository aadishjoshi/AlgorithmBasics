/**************************************************************************************************
	Power theorem Divide and Conquer:
	Last Updated :- Oct 26, 2018.
**************************************************************************************************/
import java.util.*;

class power{
	static int powerof(int x,int n){
		if(n ==0){return 1;}
		else{
			int p = powerof(x*x,n/2);
			if(n%2 == 1){return p*x;}
			else{return p;}
		}
	}
	public static void main(String args[]){
		System.out.print(" "+powerof(2,3));
	}
}