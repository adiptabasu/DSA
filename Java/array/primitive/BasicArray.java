package array.primitive;

import java.util.Arrays;

public class BasicArray 
{
	public static void main(String[] args) 
	{
		int basicArr[]= {1,2,3,4,5,6,7,8,9,10};
		//ForEachLoop
		for(int data:basicArr)
		{
			System.out.println(data);
		}
		//ForEachLambda
		Arrays.stream(basicArr).forEach((data)->System.out.println(data));
		//Reduce
		System.out.println(Arrays.stream(basicArr).reduce(0, (coll,var)->coll+=var));
	}
}