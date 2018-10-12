import java.util.*;

class heapInsert{
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

	}
}