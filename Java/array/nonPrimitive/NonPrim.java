package array.nonPrimitive;

public class NonPrim 
{
	private int idNo;
	private String name;
	private float age;
	public NonPrim() 
	{
	}
	public NonPrim(int idNo, String name, float age) 
	{
		this.idNo = idNo;
		this.name = name;
		this.age = age;
	}
	public int getIdNo() 
	{
		return idNo;
	}
	public void setIdNo(int idNo) 
	{
		this.idNo = idNo;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getAge() 
	{
		return age;
	}
	public void setAge(float age) 
	{
		this.age = age;
	}
	@Override
	public String toString() {
		return "NonPrim [idNo=" + idNo + ", name=" + name + ", age=" + age + "]";
	}
	
}
