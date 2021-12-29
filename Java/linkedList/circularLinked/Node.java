package linkedList.circularLinked;

public class Node 
{
	private int dataVal;
	private Node next;
	public Node()
	{
	}
	public Node(int dataVal,Node next) 
	{
		this.dataVal=dataVal;
		this.next=next;
	}
	public int getDataVal()
	{
		return this.dataVal;
	}
	public void setDataVal(int dataVal)
	{
		this.dataVal=dataVal;
	}
	public Node getNext() 
	{
		return next;
	}
	public void setNext(Node next) 
	{
		this.next = next;
	}
	@Override
	public String toString() 
	{
		return "Node [dataVal=" + dataVal + ", next=" + next + "]";
	}
}