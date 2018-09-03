import java.lang.*;
import java.util.*;
class isPrime{

public static int findPrime(int a,int i){
if(a ==i)return 1;

if(a %i == 0) return 0;

return findPrime(a,i+1);
}

public static void main(String args[]){

System.out.println("Enter number");
Scanner s = new Scanner(System.in);
int p = s.nextInt();
System.out.println(""+findPrime(p,2));
}




}
