public class ListTester {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(3);
		sll.add(4);
		sll.add(10);
		sll.add(5);
		sll.add(15);
		sll.add(2);
		sll.printValues();
		sll.remove();
		sll.printValues();
		sll.remove();
		sll.printValues();
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Node {
	public int value;
	public Node next;
	public Node (int value) {
		this.value = value;
		this.next = null;
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		this.head = null;
	}
	public void add(int value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			head = newNode;
		}
		else {
			Node runner = this.head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	public Node remove() {
		Node runner = this.head;
		while(runner.next.next != null) {
			runner = runner.next;
		}
		Node removed = runner.next;
		runner.next = null;
		return removed;
	}
	public void printValues() {
		Node runner = this.head;
		while (runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
	}
}