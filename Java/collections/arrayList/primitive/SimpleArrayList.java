package collections.arrayList.primitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleArrayList 
{
	public static void main(String[] args) 
	{
		//Populating the ArrayList:Start
		ArrayList<Integer> arrLst=new ArrayList<Integer>();
		for(int i=0;i<=110;i++) {
			arrLst.add(i);
		}
		//Populating the ArrayList:End
		
		//Removing an element from the list:Start
		arrLst.remove(new Integer(100));
		System.out.println(arrLst.toString());
		//Removing an element from the list:End
		
		//Filtering into new List:Start
		List<Integer> evenList=arrLst.stream().filter((elem)->elem%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		//Filtering into new List:End
		
		//Mapping into new List:Start
		List<Integer> sqrMap=arrLst.stream().map((elem)->elem*elem).collect(Collectors.toList());
		System.out.println(sqrMap);
		//Mapping into new List:End
		
		//Reducing into a a single variable:Start
		int sum=arrLst.stream().reduce(0, (collector,elem)->collector+=elem);
		System.out.println(sum);
		//Reducing into a a single variable:End
		
		//Using Filter,Map and Reduce together:Start
		int allTog=arrLst.stream().filter((elem)->elem%2==0).map((elem)->elem*elem).reduce(0, (adder,elem)->adder+=elem);
		System.out.println(allTog);
		//Using Filter,Map and Reduce together:End
		
		//Reverse Order Sorting:Start
		Collections.sort(arrLst,Collections.reverseOrder());
		System.out.println(arrLst);
		//Reverse Order Sorting:End
	}
}
