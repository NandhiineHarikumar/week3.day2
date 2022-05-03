package week3.day2;

import java.util.HashSet;

public class FindIntersectionUsingCollections {

	public void findIntersection(int[] array1,int[] array2)
	{
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i : array1)
		{
			set1.add(i);
		}
		for(int i : array2)
		{
			set2.add(i);
		}
		set1.retainAll(set2);
		System.out.println(set1);
	}
	
	public static void main(String[] args)
	{
		FindIntersectionUsingCollections obj =new FindIntersectionUsingCollections();
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		obj.findIntersection(array1, array2);
	}

}
