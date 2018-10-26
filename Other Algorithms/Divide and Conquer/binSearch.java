/**************************************************************************************************
	binary Search Divide and Conquer: O(logn)
	Last Updated :- Oct 26, 2018.
**************************************************************************************************/
import java.util.*;

class binSearch{
	static int a[];

	public static int bSearch(int p,int r,int x){
		if(p > r ){return 0;}
		else{
			int mid = (p+r)/2;
			if(a[mid] == x){return mid;}
			else if(a[mid] > x){return bSearch(p,mid,x);}
			else{return bSearch(mid+1,r,x);}
		}
	}

	public static void main(String args[]){
		a = new int[]{10,20,30,40,50};
		System.out.println(" "+bSearch(0,4,50));
	}
}