package linkedList.doublyLinkedCircular;

public class DoublyLinkedCircularLinkedList 
{
	private Node head;
	private Node getTail()
	{
		Node tail=head;
		while(tail.getNext()!=head)
		{
			tail=tail.getNext();
		}
		return tail;
	}
	public void addToHead(int dataVal)
	{
		Node tempHead=new Node(dataVal);
		if(head==null)
		{
			head=tempHead;
			tempHead.setNext(tempHead);
			tempHead.setPrev(tempHead);
		}
		else
		{
			Node tail=getTail();
			tail.setNext(tempHead);
			tempHead.setPrev(tail);
			tempHead.setNext(head);
			head=tempHead;
		}
	}
	public void add(int dataVal)
	{
		Node tempNode=new Node(dataVal);
		if(head==null)
			addToHead(dataVal);
		else
		{
			Node tail=getTail();
			tempNode.setPrev(tail);
			tempNode.setNext(head);
			tail.setNext(tempNode);
			head.setPrev(tempNode);
		}
	}
	public void addAtIndex(int dataVal,int index)
	{
		if(index==0)
			addToHead(dataVal);
		else
		{
			Node tempHead=head;
			int currCount=0;
			while(tempHead.getNext()!=head && index!=1)
			{
				tempHead=tempHead.getNext();
				currCount++;
				if(currCount == index-1)
				{
					break;
				}
			}
			Node tempNode=new Node(dataVal, tempHead.getNext(), tempHead);
			tempHead.setNext(tempNode);
			tempNode.getNext().setPrev(tempNode);
		}
	}
	public void updateAtIndex(int dataVal,int index)
	{
		if(index==0)
			head.setDataVal(dataVal);
		else
		{
			Node tempHead=head;
			while(tempHead.getNext()!=head && index!=0)
			{
				tempHead=tempHead.getNext();
				index--;
			}
			if(index==0)
				tempHead.setDataVal(dataVal);
			else
				System.out.println("Index is out of bounds.");
		}
	}
	public void printValueAtIndex(int index)
	{
		String output="No Data Found";
		Node tempHead=head;
		while(tempHead.getNext()!=head && index!=0)
		{
			tempHead=tempHead.getNext();
			index--;
		}
		if(index==0)
			output="The Value at Index is : "+String.valueOf(tempHead.getDataVal());
		System.out.println(output);
	}
	public void printAllValues()
	{
		String output="";
		if(head==null)
			output="Head is empty";
		else
		{
			Node tempHead=head;
			while(tempHead.getNext()!=head)
			{
				output+=tempHead.getDataVal()+"\t->\t";
				tempHead=tempHead.getNext();
			}
			output+=tempHead.getDataVal();
		}
		System.out.println(output);
	}
}