package programs;

public class smallestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1, 2, 3},{8, 9 , 10},{15, 17, 19}};
		int min = a[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
