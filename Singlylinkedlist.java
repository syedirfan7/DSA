
/* implementation of simple LL

class Singlylinkedlist{

Node head;

class Node{

int data;
Node next;


Node(int d){

data=d;

}
}
public static void main (String args[]){
System.out.print("Singlylinkedlist");}
}
*/

/*first ll impletation  */
class Singlylinkedlist{
Node head;

static class Node{

int data;
Node next;
Node(int d){data=d;next=null;}
}

public void printList(){
System.out.println("Displaying the list");
Node n=head;
while(n!=null){
System.out.println(" "+n.data+" ");
n=n.next;

}

}

public void push(int data){

Node newNode=new Node(data);
newNode.next=head;
head=newNode;
System.out.println("New Node with data "+head.data+" added succefully" );
}

public void insertnext(Node prevNode,int data){
if (prevNode!=null){
Node newNode=new Node(data);
newNode.next=prevNode.next;
prevNode.next=newNode;
System.out.println("A new node "+prevNode+" is added with value "+data);
}else {System.out.println("previous  node is null use push(data) to perfrom the action");}

}

public void insertlast(int data){
Node newNode=new Node(data);
if (head==null){
head=newNode;
return;// check why this works 
}
Node n=head;


while (n.next!=null){
n=n.next;

}
n.next=newNode;
//return;
}
public void deletefirst(){
	//Node n=head;
	if (head!=null){
	System.out.println("Deleted first element "+head.data);
	head=head.next;}
	else {System.out.println("No Nodes to delete");}
	}

	public void deleteNode(int key){
		//to delete the first occurence of the given key 
		Node temp=head,prev=null;
		if (temp!=null&&temp.data==key){// if head has the given key
			System.out.println("Deleted the Node with key "+temp.data);
			head=temp.next;
		}
		while(temp!=null&&temp.data!=key){//action to traverse the list
			prev=temp;
			temp=temp.next;
		}
		if (temp==null){return ;}// no key found
		System.out.println("Deleted the Node with key "+temp.data);
		prev.next=temp.next;/* the node which the present node was pointing to will be pointed by the node previous to it
							unlinkk the node*/
							
		}
	public void deletelast(){
		
	}
public static void main(String args[]){

Singlylinkedlist slist=new Singlylinkedlist();

//slist.head=new Node(1);
//Node second=new Node(2);
//Node third=new Node(3);
//slist.head.next=second;
//second.next=third;

slist.printList();
slist.push(4);
slist.printList();
//slist.insertnext(second,6);
slist.printList();
slist.insertlast(7);
slist.printList();
/* slist.head.next.next=new Node(1);
Node second=new Node(2);
Node third=new Node(3);
slist.head.next.next.next=second;
second.next=third;
 */slist.insertlast(7);
slist.printList();

slist.insertlast(7);
slist.printList();	
slist.push(10);
slist.push(15);

slist.printList();
// slist.insertnext(second,8);
//slist.printList();
slist.deletefirst();
slist.printList();
slist.deleteNode(7);
slist.deleteNode(7);
slist.deleteNode(4);
slist.printList();
}
}
