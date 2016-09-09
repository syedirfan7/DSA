import java.util.Scanner;
class Factorial{
	public static void main (String args[]){
		System.out.println("Enter a number for to get its factorial");
		Scanner n=new Scanner(System.in);
		int number=n.nextInt();
		int val=number;
		int factorial=1;
		for (int i=0;i<val;i++){
			factorial*=number;
			number--;
		}
System.out.println("Factorial of "+val+" is "+factorial);
}
}