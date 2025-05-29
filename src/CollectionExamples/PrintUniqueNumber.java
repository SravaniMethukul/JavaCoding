package CollectionExamples;

import java.util.ArrayList;

public class PrintUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4, 5, 6, 7, 4, 3, 9};
		//print unique number from the list
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[j] == a[i]) {
						k++;
					}
				}
				System.out.println("value "+a[i]);
				System.out.println("count "+k);
				if(k==1) {
					System.out.println(a[i]+" is unique number");
				}
			}
		}
		
	}
}
