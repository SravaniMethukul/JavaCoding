package CollectionExamples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sravani");
		a.add("Programming");
		a.add("java");
		System.out.println(a);
		a.add(0, "M"); // add at index
		a.remove(1); //remove method
		a.remove("Programming");
		System.out.println(a);
		System.out.println(a.get(1)); //get element from index
		
		System.out.println(a.contains("M")); //check if array list contains text
		System.out.println(a.indexOf("java")); // to get index of particular string
		
		System.out.println(a.size()); // get size of array
		System.out.println(a.isEmpty()); // check if array list is empty
	}

}
