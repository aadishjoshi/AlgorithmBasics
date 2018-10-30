import java.util.*;
class QuickSorting{

	public static void QuickSort(int A[], int p, int r){
		if(p<r){
			int q = partition(A,p,r);
			QuickSort(A,p,q-1);
			QuickSort(A,q+1,r);
		}
	}

	public static int partition(int A[],int p,int r){
		int x = A[r];
		System.out.println("A[r]: "+A[r]);
		int i = p - 1;
		System.out.println("i: "+i);
		int temp;
		for(int j = p; j<r; j++){
			if(A[j] <= x){
				i += 1;
				temp = A[j];
				A[j] = A[i];
				A[i] = temp;

			}
		}

		int temp2 = A[r];
		A[r] = A[i+1];
		A[i+1] = temp2;

		return i+1;

	}

	public static void main(String args[]){
		int A[] = new int[]{10,5,4,30,15};
		QuickSort(A,0,A.length-1);

		for(int i = 0; i< A.length; i++){
			System.out.print(" "+A[i]);
		}
	}
}