class DoublyLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
		data=d;
		next=null;
		prev=null;
		}
	}
	public void push(int data){
		Node newNode=new Node(data);
		Node temp=head;
		temp.prev=newNode;
		newNode.next=head;
		
		head=newNode;
		System.out.println(newNode.data+" is pushed into the list now");
		//return newNode;
		
		}
		/* public void printDll(){
			Node n= head;
			if (head!=null){
			while(n.next!=null){
				System.out.print(" "+n.data);
				n=n.next;
			}	
		}else {System.out.println("List is empty");}
				
				} */
	public void printList(){
System.out.println("Displaying the list");


if (head!=null){
Node n=head;
while(n!=null){
	boolean b = n.prev==null?true:false;
System.out.println(n.data+" "+ b);
n=n.next;


}
}
else{System.out.println("List is empty");}
}			


	public static void main(String args[]){
		
		DoublyLinkedList dll = new DoublyLinkedList();	
		System.out.println("Printing Doubly Linkedlist");
		//dll.printList();
		dll.push(4);
		dll.printList();
		//System.out.println(n.data);
		dll.push(10);
		dll.printList();
		//System.out.println(n.data);
	dll.push(150);
		dll.printList();
		
	}
	
	}