package linkedList.singlyLinked;

public class SinglyLinkedLinkedList 
{
	private Node head;
	public void addToHead(int dataVal) 
	{
		Node temp=new Node();
		temp.setDataVal(dataVal);
		temp.setNext(null);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			temp.setNext(head);
			head=temp;
		}
	}
	public void addNode(int dataVal)
	{
		Node temp=new Node();
		temp.setDataVal(dataVal);
		temp.setNext(null);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node temphead=head;
			while(!(temphead.getNext()==null))
			{
				temphead=temphead.getNext();
			}
			temphead.setNext(temp);
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
			Node temp=new Node(dataVal, null);
			int currIndex=0;
			Node temphead=head;
			while(temphead.getNext()!=null && index!=1)
			{
				temphead=temphead.getNext();
				currIndex++;
				if(currIndex==index-1)
				{
					break;
				}
			}
			temp.setNext(temphead.getNext());
			temphead.setNext(temp);
		}
	}
	public void updateAtIndex(int dataVal,int index)
	{
		if(index==0)
		{
			head.setDataVal(dataVal);
		}
		else 
		{
			Node temphead=head;
			int currIndex=0;
			while(temphead.getNext()!=null)
			{
				temphead=temphead.getNext();
				currIndex++;
				if(currIndex==index)
				{
					break;
				}
			}
			if(index>currIndex)
			{
				System.out.println("Out of Bounds");
			}
			else
			{
				temphead.setDataVal(dataVal);
			}
		}
	}
	public void deleteHead()
	{
		head=head.getNext();
	}
	public void deleteLast()
	{
		Node temphead=head;
		while(temphead.getNext().getNext()!=null)
		{
			temphead=temphead.getNext();
		}
		temphead.setNext(null);
	}
	public void deleteAtIndex(int index)
	{
		if(index==0)
		{
			deleteHead();
		}
		else
		{
			Node temphead=head;
			int currIndex=0;
			while(temphead.getNext()!=null && index!=1)
			{
				temphead=temphead.getNext();
				currIndex++;
				if(currIndex==index-1)
				{
					break;
				}
			}
			if(index>currIndex)
			{
				System.out.println("Out of Bounds");
			}
			else
			{
				temphead.setNext(temphead.getNext().getNext());
			}
		}
	}
	public int size()
	{
		int size=0;
		if(head!=null)
		{
			Node temphead=head;
			while(temphead.getNext()!=null)
			{
				temphead=temphead.getNext();
				size++;
			}
			size++;
		}
		return size;
	}
	public void printAllNodeValues()
	{
		String allVals="";
		Node temphead=head;
		while(temphead.getNext()!=null)
		{
			allVals+=temphead.getDataVal()+" , ";
			temphead=temphead.getNext();
		}
		allVals+=temphead.getDataVal();
		System.out.println(allVals);
	}
	public void reverseRecursive()
	{
		head=reverseRecursive(head);
	}
	private Node reverseRecursive(Node head)
	{
		if(head==null||head.getNext()==null)
		{
			return head;
		}
		Node newHead=reverseRecursive(head.getNext());
		Node headNext=head.getNext();
		headNext.setNext(head);
		head.setNext(null);
		return newHead;
	}
	public void reverseIterative()
	{
		head=reverseIterative(head);
	}
	private Node reverseIterative(Node head)
	{
		Node currNode=head;
		Node prevNode=null;
		while(currNode!=null)
		{
			Node tempNode=currNode.getNext();
			currNode.setNext(prevNode);
			prevNode=currNode;
			currNode=tempNode;
		}
		return prevNode;
	}
}