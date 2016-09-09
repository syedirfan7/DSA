import java.util.Scanner;
class RecursiveFactorial{
	public static void main (String args[]){
	System.out.println("Enter a number for to get its factorial");
	Scanner n=new Scanner(System.in);
	int number=n.nextInt();
	System.out.println(fact(number));
	}
	public static int fact(int x){
	if (x==0|| x==1){return 1;}
	else return fact(x-1)*x;
	
	
	}
}