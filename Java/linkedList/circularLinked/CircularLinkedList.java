package linkedList.circularLinked;

public class CircularLinkedList 
{
	private Node head;
	public void addToHead(int dataVal)
	{
		Node tempHead=new Node(dataVal, null);
		if(head==null)
		{
			head=tempHead;
			tempHead.setNext(head);
		}
		else
		{
			tempHead.setNext(head);
			head=tempHead;
			Node tempNode=head.getNext();
			while(tempNode.getNext()!=head.getNext())
			{
				tempNode=tempNode.getNext();
			}
			tempNode.setNext(head);
		}
	}
	public void addToLast(int dataVal)
	{
		Node tempNode=new Node(dataVal, null);
		if(head==null)
		{
			head=tempNode;
			tempNode.setNext(head);
		}
		else
		{
			Node tempHead=head;
			while(tempHead.getNext()!=head)
			{
				tempHead=tempHead.getNext();
			}
			tempNode.setNext(head);
			tempHead.setNext(tempNode);
		}
	}
	public void printAllValues()
	{
		String dataVal="";
		if(head==null)
		{
			dataVal="No Data";
		}
		else
		{
			Node tempNode=head;
			while(tempNode.getNext()!=head)
			{
				dataVal+=tempNode.getDataVal()+" , ";
				tempNode=tempNode.getNext();
			}
			dataVal+=tempNode.getDataVal();
		}
		System.out.println(dataVal);
	}
}