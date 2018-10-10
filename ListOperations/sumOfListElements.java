import java.util.*;

class node{
	int val;
	node next;

	public node(){
		this.val = -1;
		this.next = null;
	}
	public node(int val){
		this.val = val;
		this.next = null;
	}
}

class sumOfListElements{
	
	public static node createNode(node head, int v){
		node n = new node(v);
		if(head.val == -1){
			head = n;
		}else{
			n.next = head;
			head = n;
		}
		return head;
	}

	public static void printList(node n){
		node curr;
		curr = n;
		while(curr != null){
			System.out.println(curr.val);
			curr = curr.next;
		}
	}

	public static void sum(node n){
		node curr = n;
		int sum1 = 0;
		while(curr != null){
			sum1 = sum1 + curr.val;
			curr = curr.next;
		}

		System.out.println(sum1);
	}


	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num,i=0,num1;
		node head = new node();
		System.out.println("Enter how many nodes");
		num = s.nextInt();

		System.out.println("Enter your node vals");
		while(i != num){
			num1 = s.nextInt();
			head = createNode(head,num1);
			i++;
		}
		printList(head);
		sum(head);
	}
}