/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



public class Main
{
    public static class Node {
    int data;
    Node next;
    
    public  Node(int data) {
        this.data = data;
        this.next = null;
    }
}

	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		Node head = a;
		
		Node temp = head;
		
		while(temp != null) {
		    System.out.println(temp.data);
		    temp = temp.next;
		}
		
	}
}
