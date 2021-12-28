package linkedList.singlyLinked;

public class Main 
{
	public static void main(String[] args) 
	{
		SinglyLinkedLinkedList sLL=new SinglyLinkedLinkedList();
		sLL.addToHead(10);
		sLL.addNode(20);
		sLL.addNode(30);
		sLL.addNode(50);
		sLL.addAtIndex(40, 3);
		sLL.updateAtIndex(100, 3);
		sLL.deleteLast();
//		sLL.deleteHead();
//		sLL.deleteAtIndex(5);
		sLL.printAllNodeValues();
		System.out.println(sLL.size());
		sLL.reverseRecursive();
		sLL.printAllNodeValues();
		sLL.reverseIterative();
		sLL.printAllNodeValues();
	}
}