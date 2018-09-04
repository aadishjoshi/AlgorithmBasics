import java.util.*;
import java.lang.*;
	
class node{
	int val = -1;
	node next;
}

class ListCRUD{

public static node insertList(node n,int num)
{
System.out.println("Enter val:");
if(n.val == -1){
	n.val= num;
	n.next = null;
	return n;
}else
{
node n1 = new node();
n1.val = num;
n1.next = n;
return n1;
}
}

public static node deleteList(node n,int num){
node curr = n;
node prev = curr;
if(curr.next == null){
node blankNode = new node();
return blankNode;
}else{

while(curr.val != num){
prev = curr;
curr = curr.next;
}
prev.next = curr.next;
curr.next = null;

return n;
}
}

public static void traverseList(node temp){
if(temp != null){
System.out.println(""+temp.val);
traverseList(temp.next);
}else{
return ;
}

}


public static void main(String args[]){
Scanner s = new Scanner(System.in);
node head = new node();
int ch,num;
do{
System.out.println("1)add 2)Delete 3)exit");
ch = s.nextInt();
switch(ch){
	case 1: System.out.println("Enter number to add: ");
		num = s.nextInt();
		head = insertList(head,num);
		break;
	case 2: traverseList(head);
		System.out.println("Enter number to Delete: ");
		num = s.nextInt();
		head = deleteList(head,num);
		break;
	case 3: break;
}
}while(ch!=3);

}

}
