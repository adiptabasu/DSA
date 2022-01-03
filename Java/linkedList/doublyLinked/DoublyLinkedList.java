package linkedList.doublyLinked;

public class DoublyLinkedList 
{
	private Node head;
	public void addToHead(int dataVal)
	{
		Node tempHead=new Node(dataVal, null, null);
		if(head==null)
		{
			head=tempHead;
		}
		else
		{
			tempHead.setNext(head);
			head.setPrev(tempHead);
			head=tempHead;
		}
	}
	public void add(int dataVal)
	{
		Node tempNode = new Node(dataVal, null, null);
		if(head==null)
			addToHead(dataVal);
		else
		{
			Node tailNode=head;
			while(tailNode.getNext()!=null)
			{
				tailNode=tailNode.getNext();
			}
			tempNode.setPrev(tailNode);
			tailNode.setNext(tempNode);
		}
	}
	public void addAtIndex(int dataVal,int index)
	{
		if(head==null||index==0)
			addToHead(dataVal);
		else
		{
			Node tempHead=head;
			int currCount=0;
			while(tempHead.getNext()!=null && index !=1)
			{
				tempHead=tempHead.getNext();
				currCount++;
				if(currCount==index-1)
				{
					break;
				}
			}
			Node tempNode=new Node(dataVal, null, null);
			tempNode.setNext(tempHead.getNext());
			tempNode.setPrev(tempHead);
			tempHead.setNext(tempNode);
		}
	}
	public int getDataValAtIndex(int index)
	{
		int dataVal=-1;
		if(index==0 && head!=null)
			dataVal=head.getDataVal();
		else if(head!=null)
		{
			Node tempHead=head;
			while(tempHead.getNext()!=null && index>0)
			{
				tempHead=tempHead.getNext();
				index--;
			}
			if(index==0)
				dataVal=tempHead.getDataVal();
		}
		return dataVal;
	}
	public void updateAtIndex(int dataVal,int index)
	{
		if(head!=null)
		{
			if(index==0)
				head.setDataVal(dataVal);
			else
			{
				Node tempHead=head;
				while(tempHead.getNext()!=null && index>0)
				{
					tempHead=tempHead.getNext();
					index--;
				}
				if(index==0)
					tempHead.setDataVal(dataVal);
				else
					System.out.println("Update index is out of bounds.");
			}
		}
	}
	public void deleteAtHead()
	{
		if(head!=null)
		{
			head=head.getNext();
		}
	}
	public void deleteAtIndex(int index)
	{
		if(head!=null)
		{
			if(index==0)
			{
				deleteAtHead();
			}
			else
			{
				Node tempHead=head;
				while(tempHead.getNext()!=null && index!=1)
				{
					tempHead=tempHead.getNext();
					index--;
				}
				Node tempNode=null;
				try 
				{
					tempNode=tempHead.getNext().getNext();
				} catch (Exception e)
				{
					tempNode=null;
				}
				if(tempNode!=null)
				{
					tempNode.setPrev(tempHead);
					tempHead.setNext(tempNode);
				}
				else
				{
					System.out.println("Out of Bounds");
				}
			}
		}
	}
	public void printAllNodes()
	{
		String dataVal="";
		if(head==null)
			dataVal="Head is empty";
		else
		{
			Node tempHead=head;
			while(tempHead.getNext()!=null)
			{
				dataVal+=tempHead.getDataVal()+" -> ";
				tempHead=tempHead.getNext();
			}
			dataVal+=tempHead.getDataVal();
		}
		System.out.println(dataVal);
	}
}