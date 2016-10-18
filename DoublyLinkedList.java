class DoublyLinkedList {
	//Node head;
	
	/*http://www.javamadesoeasy.com/2015/01/doublylinkedlist-insert-and-delete-at.html*/
	 class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
		data=d;
		next=null;
		prev=null;
		}
		Node firstNode=null,lastNode;
		//System.out.println(DoublyLinkedList.lastNode+" "+firstNode);
		//firstNode.next=lastNode;
		//lastNode.prev=firstNode;
	}
	public void push(int data){
		Node newNode=new Node(data);
		
		//Node temp=first;
		firstNode.prev=newNode;
		newNode.next=firstNode;
		firstNode=newNode;
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
	if (firstNode!=null){
	Node n=firstNode;
	while(n!=lastNode){
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
		dll.firstNode = new Node(0);
		dll.lastNode=new Node(0);
		dll.firstNode.next=dll.lastNode;
		dll.lastNode.prev=dll.firstNode;
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