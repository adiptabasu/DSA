package linkedList.doublyLinkedCircular;

public class Main 
{
	public static void main(String[] args) 
	{
		DoublyLinkedCircularLinkedList dCLL = new DoublyLinkedCircularLinkedList();
		dCLL.addToHead(10);
		dCLL.addToHead(20);
		dCLL.add(30);
		dCLL.add(40);
		dCLL.printAllValues();
		dCLL.addAtIndex(100, 5);
		dCLL.printAllValues();
		dCLL.printValueAtIndex(3);
		dCLL.printAllValues();
		dCLL.updateAtIndex(300, 3);
		dCLL.printAllValues();
	}
}