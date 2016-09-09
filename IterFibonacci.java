//iterative approach for fibonacci
class  IterFibonacci{
	public static void main (String args[]){
		int i=0,first=0,second=1,third=first+second;
		System.out.print(second+","+third);
		for (i=0;i<100;i++){
			System.out.print(","+third);
			first=second;
			second=third;
			third=first+second;
		}
	}
}