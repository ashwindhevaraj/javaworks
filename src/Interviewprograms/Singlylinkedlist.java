package Interviewprograms;
public class Singlylinkedlist {
	Node head;
	Node current;
	public void insert(int data) {
		Node newone=new Node(data);
		if(head==null) {
			head=newone;
			return;
		}
		else {
			current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newone;
		}
	}
	public void display() {
		current=head;
		while(current.next!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	public void cyclecreation() {
		Node second;
		Node current;
		current=head;
		second=current.next;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=second;
	}
	public boolean cycledetection() {
		Node slow;
		Node fast;
		slow=head;
		fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;  // slow incrementing pos by 1
			fast=fast.next.next; //fast incrementing pos by 2
			if(slow==fast) {
				System.out.println("Cycle detected");
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		Singlylinkedlist l=new Singlylinkedlist();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.display();
		//l.cyclecreation();
		System.out.println(l.cycledetection());
	}

}
