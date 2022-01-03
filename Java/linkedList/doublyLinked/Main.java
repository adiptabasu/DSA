package linkedList.doublyLinked;

public class Main 
{
	public static void main(String[] args) 
	{
		DoublyLinkedList dLL=new DoublyLinkedList();
		dLL.addToHead(10);
		dLL.addToHead(20);
		dLL.add(30);
		dLL.add(40);
		dLL.add(50);
		dLL.printAllNodes();
		dLL.addAtIndex(100, 1);
		dLL.printAllNodes();
		System.out.println(dLL.getDataValAtIndex(4));
		dLL.updateAtIndex(20, 4);
		dLL.printAllNodes();
		dLL.deleteAtHead();
		dLL.printAllNodes();
		dLL.deleteAtIndex(5);
		dLL.printAllNodes();
	}
}