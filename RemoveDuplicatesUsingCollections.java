package week3.day2;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class RemoveDuplicatesUsingCollections {

	public void removeDuplicates(String input)
	{
		String[] array= input.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String s : array)
		{
			set.add(s);
		}
		//System.out.println(set.toString());
		for(String s : set) { System.out.print(s + " "); }
		 
	}
	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the String:");
		 * String text= sc.nextLine();
		 */
		RemoveDuplicatesUsingCollections obj = new RemoveDuplicatesUsingCollections();
		obj.removeDuplicates(text);

	}

}
