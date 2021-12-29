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
	}
}