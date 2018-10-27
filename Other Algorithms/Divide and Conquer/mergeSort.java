/**************************************************************************************************
	Merge sort Divide and Conquer: O(nlogn)
	Last Updated :- Oct 27, 2018.
**************************************************************************************************/
import java.util.*;
import java.lang.*;

class mergeSort{
	static int A[];
	
	/**************************************************************************************************
	* Merge sort Divide and Conquer
	**************************************************************************************************/
	public static void sort(int p, int r){
		if(p < r){
			int q = (p+r)/2;
			sort(p,q);
			sort(q+1,r);
			merge(p,q,r);
		}		
	}

	/**************************************************************************************************
	* Merge: O(n)
	**************************************************************************************************/
	public static void merge(int p,int q, int r){
		int l1 = q-p+1;
		int l2 = r-q;
		int L[]= new int [l1];
		int R[] = new int [l2];

		for(int i=0; i<l1;i++){
			L[i] = A[p+i];
		}
		for(int j=0;j<l2;j++){
			R[j] = A[q+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = p;
		while(i < l1 && j<l2){
			if(L[i] <= R[j]){
				A[k] = L[i];
				i++;
			}else{
				A[k] = R[j];
				j++;
			}
			k++;
		}

		while(i < l1){
			A[k] = L[i];
			i++;
			k++;
		}

		while(j<l2){
			A[k] = R[j];
			j++;
			k++;
		}

	}

	public static void main(String args[]){
		A = new int []{70,80,50,30,100,90};

		sort(0,A.length-1);
		for(int i=0;i<A.length; i++){
			System.out.print(""+A[i]);
		}
	}
}