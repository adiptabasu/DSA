package linkedList.doublyLinkedCircular;

public class Node 
{
	private int dataVal;
	private Node next;
	private Node prev;
	public Node()
	{
	}
	public Node(int dataVal)
	{
		this.dataVal=dataVal;
		this.next=null;
		this.prev=null;
	}
	public Node(int dataVal,Node next,Node prev)
	{
		this.dataVal=dataVal;
		this.next=next;
		this.prev=prev;
	}
	public int getDataVal() 
	{
		return dataVal;
	}
	public void setDataVal(int dataVal) 
	{
		this.dataVal = dataVal;
	}
	public Node getNext() 
	{
		return next;
	}
	public void setNext(Node next) 
	{
		this.next = next;
	}
	public Node getPrev() 
	{
		return prev;
	}
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	@Override
	public String toString() 
	{
		return "Node [dataVal=" + dataVal + ", next=" + next + ", prev=" + prev + "]";
	}
}