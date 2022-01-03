package linkedList.doublyLinked;

public class Node 
{
	private int dataVal;
	private Node prev;
	private Node next;
	public Node()
	{
	}
	public Node(int dataVal,Node prev,Node next)
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
	public Node getPrev() 
	{
		return prev;
	}
	public void setPrev(Node prev) 
	{
		this.prev = prev;
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
		return "Node [dataVal=" + dataVal + ", prev=" + prev + ", next=" + next + "]";
	}
}