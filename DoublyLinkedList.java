	 class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data=d;
		}
	}
	class Linkedlist{
		Node firstNode,lastNode;
		Linkedlist(){
			firstNode=null;
		}	
		public void push(int data){
			Node newNode=new Node(data);
			if (firstNode==null){
				lastNode=newNode;
			}else {
			firstNode.prev=newNode;}
			newNode.next=firstNode;
			firstNode=newNode;
			System.out.println(" "+newNode.data+" is pushed into the list now");
		}
		public void printForw(){
			System.out.println("Printing the list in forward direction");
			Node n= firstNode;
			if (n!=null){
				while(n!=null){
				System.out.println(" "+n.data+" ");
				n=n.next;
				}	
			}
			else {System.out.println("List is empty");}
				
		} 
		 public void printBack(){
			System.out.println("Printing the list in backward direction");
			Node n=lastNode;
			if (n!=null){
				while(n!=null){
					System.out.println(n.data);
					n=n.prev;
					}
				}
			else{System.out.println("List is empty");}
		}
		public void pop(){
			if (firstNode==null){//list is empty
				System.out.println("No Nodes to delete");
			}	else  if (firstNode.next==null){// only on node ie second node is null
				System.out.println(firstNode.data+" is popped out");		
				lastNode=null;
				firstNode=null;
			}
			else{
				System.out.println(firstNode.data+" is popped out");		
				firstNode.next.prev=null;
				firstNode=firstNode.next;
			}
			
		}	 
	}
				
public class DoublyLinkedList {
		public static void main(String args[]){
			Linkedlist linkedlist =new Linkedlist();
			System.out.println("Printing Doubly Linkedlist");
			linkedlist.push(4);
			linkedlist.push(5);
			linkedlist.push(78);
			linkedlist.printForw();
			linkedlist.printBack();
			linkedlist.push(9);
			linkedlist.printForw();
			linkedlist.printBack();
			linkedlist.pop();
			linkedlist.pop();
			linkedlist.printForw();
			linkedlist.printBack();
		}
	
	}