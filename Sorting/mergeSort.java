import java.lang.*;
import java.util.*;

class mergeSort{

	public static void mergeSorted(int a[], int left, int right){
		int mid =(left + right) /2;
		if(right <= left){return;}
		mergeSorted(a,left,mid);
		mergeSorted(a,mid+1,right);
		merge(a,left,mid,right);
	}

	public static void merge(int arr[],int left, int mid, int right){
		//find length. Create new array. If left item <= right copy it else right item. Copy remaining items

		int l1 = mid-left + 1;
		int l2 = right - mid;

		int [] leftArr = new int[l1];
		int [] rightArr = new int[l2];

		for(int i=0; i < l1; ++i){
			leftArr[i] = arr[left+i];
		}

		for(int j=0; j < l2; ++j){
			rightArr[j] = arr[mid+1+j];
		}

		int i=0, j=0;
		int k = left;

		while(i < l1 && j<l2){
			if(leftArr[i] <= rightArr[j]){
				arr[k] = leftArr[i];
				i++;
			}else{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while(i<l1){
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while(j<l2){
			arr[k] = rightArr[j];
			j++;
			k++;
		}

		for(int p = 0; p< arr.length; p++){
			System.out.println(" "+arr[p]);
		}
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i=0,n;
		System.out.println("how many numbers?");
		n = s.nextInt();
		int [] a = new int[n];
		System.out.println("Enter numbers");
		while(i!=n){
			a[i] = s.nextInt();
			i++;
		}
		mergeSorted(a, 0, n-1);
	}
}