package collections.arrayList.nonPrimitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class NonPrimArrayList 
{
	public static void main(String[] args) 
	{
		NonPrim obj1=new NonPrim("Adipta", 26, 3);
		NonPrim obj2=new NonPrim("Sneha", 26, 1);
		NonPrim obj3=new NonPrim("Arka", 25, 2);
		ArrayList<NonPrim> arr =new ArrayList<NonPrim>();
		arr.add(obj1);
		arr.add(obj2);
		arr.add(obj3);
		ArrayList<NonPrim> filter=(ArrayList<NonPrim>) arr.stream().filter((elem)->elem.getAge()>25).collect(Collectors.toList());
		System.out.println(filter);
		Collections.sort(arr,(prev,curr)->{
			return prev.getName().compareTo(curr.getName());
		});
		System.out.println(arr);
	}
}