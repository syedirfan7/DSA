import java.util.Scanner;
class ReverseNumber{

public static void main (String args[]){
System.out.println("enter a number to be reversed");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println("Entered number is "+number);
int rev_num=0;
while (number>0)
{//if (number%10!=0)
	rev_num*=10;
	rev_num+=number%10;
number=number/10;
}
System.out.println("Reversed number is "+rev_num);
}}
