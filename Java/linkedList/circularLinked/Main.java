package linkedList.circularLinked;

public class Main 
{
	public static void main(String[] args) 
	{
		CircularLinkedList cLL=new CircularLinkedList();
		cLL.printAllValues();
		cLL.addToHead(10);
		cLL.addToHead(20);
		cLL.addToHead(30);
		cLL.addToHead(40);
		cLL.addToLast(50);
		cLL.printAllValues();
		System.out.println(cLL.size());
		cLL.addAtIndex(100, 5);
		cLL.printAllValues();
		System.out.println(cLL.getAtIndex(8));
		cLL.updateAtIndex(4, 1);
		cLL.printAllValues();
		cLL.deleteAtIndex(6);
		cLL.printAllValues();
	}
}