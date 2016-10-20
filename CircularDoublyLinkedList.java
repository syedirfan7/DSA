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
		int count=0;
		Linkedlist(){
			firstNode=null;
			
		}
		public void printNode(int num){
			int numNode=num;
			Node n=firstNode;
			if (num>count){
				System.out.println("Unable to print the Node "+num+" as there are only "+count+" Nodes here");
			}else{
				while(num-1>0){
					num--;
					n=n.next;
				}
				System.out.println("Node "+numNode+" has "+n.data);
			}
			
		}
		public void insertAt(int num,int data){
			int node=num;
			Node n=firstNode;
			Node newNode=new Node(data);
			if ((num<1) ||(num>count)){
				System.out.println("Try to add the Nodes from 1 to "+count);
			}else if(num==1){
				push(data);
			}//else if (num==count){insertAtlast(data);}
			else {
				while(num-1>0){
					num--;
					n=n.next;
				}
				newNode.next=n;
				n.prev.next=newNode;
				newNode.prev=n.prev;
				n.prev=newNode;
				count++;
				System.out.println("A new node with data "+newNode.data+" is added between "+ (node-1) +" and "+node);
			}
		}		
		public void push(int data){
			Node newNode=new Node(data);
			if (firstNode==null){
				count++;
				lastNode=newNode;// added for CDLL
				firstNode=lastNode;// added for CDLL
				lastNode.next=firstNode;// added for CDLL
				firstNode.prev=lastNode;// added for CDLL
			}else {
			newNode.next=lastNode;
			firstNode.prev=newNode;
			lastNode.next=newNode;
			newNode.prev=firstNode;
			//firstNode=newNode; working at this line
			count++;
			}
			//newNode.next=firstNode;
			//firstNode=newNode;
			System.out.println(newNode.data+" is pushed into the list now\nTotal Nodes are "+count);
			
		}
		public void printForw(){
			System.out.println("Printing the list in forward direction");
			Node n= firstNode;
			if (n!=null){
				while(n!=lastNode){
				System.out.println(n.data);
				n=n.next;
				
				}	
			}
			else {System.out.println("List is empty");}
				
		} 
		 public void printBack(){
			System.out.println("Printing the list in backward direction");
			Node n=lastNode;
			if (n!=null){
				while(n!=firstNode){
					System.out.println(n.data);
					n=n.prev;
					}
				}
			else{System.out.println("List is empty");}
		}
		public void pop(){
			if (firstNode==null){//list is empty
				System.out.println("No Nodes to delete");
			}	else  if (firstNode.next==null){// only one node ie second node is null
				count--;
				System.out.println(firstNode.data+" is popped out\nTotal Nodes are "+count);		
				lastNode=null;
				firstNode=null;
				
			}
			else{
				count--;
				System.out.println(firstNode.data+" is popped out\nTotal Nodes are "+count);		
				firstNode.prev.next=firstNode.next;//added for CDLL
				firstNode.next.next=firstNode.prev;//added for CDLL
				//firstNode.next.prev=null;
				firstNode=firstNode.next;
				
			}
			
		}
		public void insertAtlast(int data){
			Node newNode=new Node(data);
			newNode.next=firstNode;// added for CDLL
			lastNode.next=newNode;
			newNode.prev=lastNode;
			firstNode.prev=newNode;// added for CDLL
			lastNode=newNode;
			count++;
			System.out.println("A new node with data "+newNode.data+" is added at the end of the list\nTotal Nodes are "+count);
		}
		public void deleteFromlast(){
			count--;
			System.out.println("lastNode is removed with data "+lastNode.data+"\nTotal Nodes are "+count);
			lastNode=lastNode.prev;
			lastNode.next=firstNode;// added for CDLL
			firstNode.prev=lastNode;// added for CDLL
			
		}
		public void deleteAt(int num){
			int numNode=num;
			Node n=firstNode;
			if ((num<1) ||(num>count)){
				System.out.println("Try to delete the Nodes from 1 to "+count);
			}
			else if (numNode==count){deleteFromlast();}
			else if (numNode==1){pop();}
			else {
				while(num-1>0){
				n=n.next;
				num--;
				}
				count--;
				System.out.println("A node with data "+n.data+" is deleted from position "+numNode+" of list\nTotal Nodes are "+count);
				n.prev.next=n.next;	
				n.next.prev=n.prev;
				
			}
		}
	}
				
public class CircularDoublyLinkedList {
		public static void main(String args[]){
			Linkedlist linkedlist =new Linkedlist();
			System.out.println("Printing Circular Doubly Linkedlist");
			 linkedlist.push(4);
			linkedlist.push(5);
			linkedlist.push(78);
			linkedlist.printForw();
			linkedlist.printBack();
			linkedlist.push(9);
			linkedlist.printForw();
			linkedlist.printBack();
			System.out.println("Total Number of Nodes= "+linkedlist.count);
			linkedlist.printNode(3);
			linkedlist.pop();
			linkedlist.pop();
			linkedlist.printForw();
			linkedlist.printBack();
			linkedlist.printNode(3);
			linkedlist.insertAt(2,100);
			linkedlist.printNode(3);
			linkedlist.printForw();
			linkedlist.printBack();
			linkedlist.insertAtlast(66);
			linkedlist.printForw();
			linkedlist.deleteFromlast();
			linkedlist.printForw();
			linkedlist.printBack();
			linkedlist.insertAt(0,55);
			linkedlist.insertAt(1,88);
			linkedlist.insertAt(6,54);
			linkedlist.insertAt(3,56);
			linkedlist.insertAt(4,45);
			linkedlist.insertAt(6,54);
			linkedlist.insertAt(8,54);
			linkedlist.printForw();
			linkedlist.printBack(); //88 5 56 45 100 54 4 
			linkedlist.deleteAt(0);
			linkedlist.deleteAt(1);
			linkedlist.deleteAt(5);
			linkedlist.	deleteAt(9);
			linkedlist.printForw();
			linkedlist.printBack();
		}
	
	}