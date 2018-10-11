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

class binTreeCRUD{
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

	public static node findNode(node v, int key){
		if(v.val == key){return v;}
		if(v == null){return ;}
		findNode(v.left,key);
		findNode(v.right,key);
	}


	public static void inTraversal(node v){
		if(v == null){return;}
		inTraversal(v.left);
		System.out.println("\t"+v.val);
		inTraversal(v.right);
	}

	public static void preTraversal(node v){
		if(v == null){return;}
		System.out.println("\t"+v.val);
		preTraversal(v.left);
		preTraversal(v.right);
	}

	public static void postTraversal(node v){
		if(v == null){return;}
		postTraversal(v.left);
		postTraversal(v.right);
		System.out.println("\t"+v.val);
	}

	public static void main(String args[]){
		int n,i=0,x,num;
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

		System.out.println("inOrder Traversal");
		inTraversal(root);
		System.out.println("preOrder Traversal");
		preTraversal(root);
		System.out.println("postOrder Traversal");
		postTraversal(root);

		
	}
}