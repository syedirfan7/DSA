    import java.util.Scanner;
    public class Prime{
    public static void main (String sargs[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the any number to check whether it is prime or not:");
    int i=1;
    int inputNum=sc.nextInt();
  	System.out.println("You have entered " + inputNum+"\n Checking.....");
	  String result=checkForPrime(inputNum,i);
	  System.out.println("The check for the prime for the given number is "+ result);
  }

    public static String checkForPrime(int x,int i){
	if (i!=x&&i!=1&&x%i==0){
	String val="false as it is divisible by "+i+" and also with \'1',"+x;
	return val;
	  }else {
	  i++;
	  return if (i>x){
	  return "true";}
	  else {
	  return checkForPrime(x,i);}
	  }
  }
}
