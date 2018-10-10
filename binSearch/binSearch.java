import java.util.*;
//log(n)

class binSearch{

	public static int searchAlgo(int a[],int p, int r, int x){
		int mid;
		if(p>r){return -1;}
		mid = (p + r)/2;

		if(a[mid] == x){
			return mid;
		}
		else if(a[mid] > x){
			return searchAlgo(a,0,mid-1,x);
		}else{
			return searchAlgo(a,mid+1,r,x);
		}

	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = 0, i=0,x=0,found;
		System.out.println("How many elements?");
		n = s.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter array elements in sorted order");
		
		while(i != n){
			arr[i] = s.nextInt();
			i ++;
		}
		System.out.println("What to search?");
		x = s.nextInt();
		found = searchAlgo(arr,0,n,x);
		System.out.println(found+"");
	}
}