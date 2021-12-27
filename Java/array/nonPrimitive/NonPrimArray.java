package array.nonPrimitive;

import java.util.Arrays;

public class NonPrimArray 
{
	public static void main(String[] args) 
	{
		NonPrim obj1=new NonPrim(3, "Arka", 25);
		NonPrim obj2=new NonPrim(1, "Deb", 25);
		NonPrim obj3=new NonPrim(2, "Adipta", 26);
		NonPrim arr[]= {obj1,obj2,obj3};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getName());
		}
		for(NonPrim elem:arr)
		{
			System.out.println(elem.getIdNo());
		}
		Arrays.sort(arr,(prev,curr)->{
			return prev.getName().compareTo(curr.getName());
		});
		Arrays.stream(arr).forEach((elem)->System.out.println(elem));
		Arrays.sort(arr,(prev,curr)->{
			return prev.getIdNo()-curr.getIdNo();
		});
		Arrays.stream(arr).forEach((elem)->System.out.println(elem));
	}
}