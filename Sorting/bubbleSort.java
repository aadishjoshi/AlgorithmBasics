import java.util.*;
class bubbleSort{
	public static void bubbleSorted(int [] a, int n){
		int i,temp;
		boolean swapped = true;
		while(swapped == true){
			swapped = false;
			for(i =0; i<n-1; i++){
				if(a[i] >= a[i+1]){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
				}
			}
		}
		for(i=0;i<n;i++){
			System.out.print(a[i]+"");
		}
	}

	public static void main(String args[]){
		int n=0;		
		
		int i=0,num;
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers: ");
		n = s.nextInt();
		int [] a = new int[n];
		System.out.println("Enter numbers: ");
		while(i != n){
			num = s.nextInt();
			a[i] = num;
			i++;
		}
		bubbleSorted(a,n);
	}
}