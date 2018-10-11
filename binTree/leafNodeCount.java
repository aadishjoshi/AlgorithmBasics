import java.util.*;


class node{
	int val;
	node right;
	node left;

	node(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

class leafNodeCount{
	static node root;

	public static node insert(node n,node NODE){
		if(n == null){
			root = NODE;
			System.out.println("root is: "+root.val);
			return n;	
		}else{
			if(n.val >= NODE.val){
				if(n.left == null){
					n.left = NODE;
					return n;	
				}
				return insert(n.left,NODE);
				
			}else{
				if(n.right == null){
					n.right = NODE;
					return n;
				}
				return insert(n.right,NODE);
			}
		}
	}

	public static int findCount(node n){
		if(n == null){return 0;}
		if(n.left == null && n.right == null){return 1;}
		return findCount(n.left) + findCount(n.right);
	}
	

	public static void main(String args[]){
		int n,i=0,x,num,count;
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers");
		n = s.nextInt();

		System.out.println("Enter numbers");
		while(i != n){
			num = s.nextInt();
			node n1 = new node(num);
			insert(root,n1);
			i++;
		}
		count = findCount(root);
		System.out.println("Count : " + count);
	}
}