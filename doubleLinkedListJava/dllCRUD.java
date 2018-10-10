import java.util.*;
import java.lang.*;

class node{
int val;
node next;
node prev;

public node(){
this.val = 0;
this.next = null;
this.prev = null;
}

public node(int v){
node n = new node();
n.val = v;
}

}

class dllCRUD{

static node head;
static node tail;

public static void addNode(int v){
node n = new node(v);
if(head == null){
head = n;
tail = n;
}else{
n.next = head;
head.prev = n;
n = head;
}
traverse();
}
	
public static void deleteNode(){


}

public static void traverse(){
node curr;
curr = head;
while(curr !=null){
System.out.println(""+curr.val);
curr = curr.next;
}
}


public static void main(String args[]){
int ch = 0;
Scanner s = new Scanner(System.in);
do{
System.out.println("1) Add node 2)Delete Node 3)exit");
ch = s.nextInt();

switch(ch){
	case 1: System.out.println("Enter node val");
		addNode(s.nextInt());
		break;
	case 2: deleteNode();
		break;
	default: break;
}
}while(ch != 3);
}



}
