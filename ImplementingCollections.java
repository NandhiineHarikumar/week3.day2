package week3.day2;

import java.util.ArrayList;
import java.util.Collections;


public class ImplementingCollections
{

	public ArrayList<Integer> convertToList(int[] array)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : array)
		{
			list.add(i);
		}
		return list;
	}
	
	public void findSecondLargestNumber(int[] array)
	{
		ArrayList<Integer> list = convertToList(array);
		Collections.sort(list);
		System.out.println("Second largest number: "+list.get((list.size()-2)));
	}
	
	public void findMissingElement(int[] array)
	{
		ArrayList<Integer> list = convertToList(array);
		Collections.sort(list);
		//System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)!=(i+1))
			{
				System.out.println("Missing element:"+  (i+1) );
				break;
			}
		}
	}
	
	public void findDuplicates(int[] array)
	{
		ArrayList<Integer> list = convertToList(array);
		Collections.sort(list);
		System.out.println("Duplicates: ");
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i) == list.get(j))
				{
					System.out.print(list.get(i) + ",");
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] array = {3,2,10,4,6,7,9};
		ImplementingCollections obj = new ImplementingCollections();
		obj.findSecondLargestNumber(array);
		int[] arr = {1,2,3,4,7,6,8};
		obj.findMissingElement(arr);
		int[] input= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		obj.findDuplicates(input);
	}

}
