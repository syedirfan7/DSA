
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
Node n=head;
while(n!=null){
System.out.print(" "+n.data+" ");
n=n.next;

}

}

public void push(int data){

Node newNode=new Node(data);
newNode.next=head;
head=newNode;
System.out.print("New Node with data "+head.data+" added succefully" );
}

public void insertnext(Node prevNode,int data){
if (prevNode!=null){
Node newNode=new Node(data);
newNode.next=prevNode.next;
prevNode.next=newNode;

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

public static void main(String args[]){


Singlylinkedlist slist=new Singlylinkedlist();

//slist.head=new Node(1);
//Node second=new Node(2);
//Node third=new Node(3);
//slist.head.next=second;
//second.next=third;

slist.printList();
//slist.push(4);
//slist.printList();
//slist.insertnext(second,6);
//slist.printList();
slist.insertlast(7);
slist.printList();

slist.head.next=new Node(1);
Node second=new Node(2);
Node third=new Node(3);
slist.head.next.next=second;
second.next=third;
slist.printList();
slist.push(10);
slist.printList();
slist.insertnext(second,8);
slist.printList();
}
}