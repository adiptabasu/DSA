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
			//Alternate Way, not Elegant :Start
			//tempHead.setNext(head);
			//head=tempHead;
			//Node tempNode=head.getNext();
			//while(tempNode.getNext()!=head.getNext())
			//{
			//	tempNode=tempNode.getNext();
			//}
			//tempNode.setNext(head);
			//Alternate Way, not Elegant :End
			Node tailRef=head;
			while(tailRef.getNext()!=head) {
				tailRef=tailRef.getNext();
			}
			tailRef.setNext(tempHead);
			tempHead.setNext(head);
			this.head=tempHead;
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
	public void addAtIndex(int dataVal,int index)
	{
		if(index==0) 
		{
			addToHead(dataVal);
		}
		else 
		{
			Node tempNode = new Node(dataVal,null);
			int currCount=0;
			Node tempHead=head;
			while(tempHead.getNext()!=head && index!=1)
			{
				currCount++;
				tempHead=tempHead.getNext();
				if(currCount==index-1)
				{
					break;
				}
			}
			tempNode.setNext(tempHead.getNext());
			tempHead.setNext(tempNode);
		}
	}
	public int getAtIndex(int index)
	{
		int dataVal=0;
		Node tempHead=head;
		while(tempHead.getNext()!=head && index!=0)
		{
			index--;
			tempHead=tempHead.getNext();
		}
		if(index>0)
		{
			dataVal= -1;
		}
		else
		{
			dataVal=tempHead.getDataVal();
		}
		return dataVal;
	}
	public void updateAtIndex(int dataVal,int index)
	{
		Node tempHead=head;
		while(tempHead.getNext()!=head && index!=0)
		{
			index--;
			tempHead=tempHead.getNext();
		}
		if(index>0)
		{
			System.out.println("Index Out Of Bound");
		}
		else
		{
			tempHead.setDataVal(dataVal);
		}
	}
	public void deleteAtIndex(int index)
	{
		if(index==0)
		{
			Node tailRef=head;
			while(tailRef.getNext()!=head)
			{
				tailRef=tailRef.getNext();
			}
			head=head.getNext();
			tailRef.setNext(head);
		}
		else
		{
			Node tempHead=head;
			int currIndex=0;
			while(tempHead.getNext()!=head && index!=1)
			{
				currIndex++;
				tempHead=tempHead.getNext();
				if(currIndex==index-1)
				{
					break;
				}
			}
			if(index>currIndex)
			{
				System.out.println("Out of bounds");
			}
			else
			{
				tempHead.setNext(tempHead.getNext().getNext());
			}
		}
	}
	public int size() {
		int size=0;
		if(head!=null) {
			Node tempNode=head;
			while(tempNode.getNext()!=head)
			{
				tempNode=tempNode.getNext();
				size++;
			}
			size++;
		}
		return size;
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