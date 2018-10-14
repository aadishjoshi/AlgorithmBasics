import java.util.*;
import java.lang.Math.*;

class heapSort{
	static final int MAX = 100;
	static int [] a = new int[MAX];

	public static void insert(){
		int l = a[0];
		int temp;
		if(l == 1){
			return ;
		}else{
			int ptr = l;
			while(ptr != 1){
				int parent = ptr/2;
				if(a[ptr] <= a[parent]){
					temp = a[ptr];
					a[ptr] = a[parent];
					a[parent] = temp;
				}
				ptr = parent;
			}
		}
	}

	public static void heapify(int length){
		int minChild, minChildIndex; 
		int temp;
		int i = 1;
		if(length == 1){
			return;
		}else{
			int ptr = 1;
			while(i < length){
				i = i*2;
				int child1 = (ptr * 2);
				int child2 = (ptr * 2) + 1;
				
				if(a[child1] > a[child2]){
					minChildIndex = child2;
					minChild = a[child2];
				}else{
					minChildIndex = child1;
					minChild = a[child1];
				}

				if(minChildIndex >= length){
					break;
				}

				if(a[ptr] > minChild){
					temp = a[ptr];
					a[ptr] = minChild;
					a[minChildIndex] = temp;
					ptr = minChildIndex;
				}
			}
		}
	}

	public static void heapSorted(){
		int temp = 0;
		int len = a[0];
		for(int i = len; i>1; i--){
			temp = a[1];
			a[1] = a[i];
			a[i] = temp;
			heapify(i);
		}
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers to heap. -1 to exit");
		
		int i = 1;
		int num;
		do{
			num = s.nextInt();
			if(num == -1){
				break;
			}else{
				a[0] = i;
				a[i] = num;
				insert();
				i++;
				
			}
		}while(true);

		for(int j=0;j<i; j++){
			System.out.println("\t"+a[j]);
		}

		heapSorted();		

		System.out.println("*** After Sorting ***");

		for(int j=0;j<a[0]+1; j++){
			System.out.println("\t"+a[j]);
		}
	}
}