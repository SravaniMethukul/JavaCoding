package programs;

public class ciscoInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{12, 4, 3}, {7, 10, 18}, {19, 21, 26}};
		int min = a[0][0], columnNum = 0, maxNum = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j] < min) {
					min = a[i][j];
					columnNum = j;
				}
			}
		}
		
		System.out.println(columnNum);
		maxNum = a[0][columnNum];
		for(int k=0;k<3;k++) {
			if(a[k][columnNum] > maxNum ) {
				maxNum = a[k][columnNum];
			}
		}
		
		System.out.println(maxNum);
	}

}


/*
2  4   5
7  10  18
19 21  26

Find minimum number then in the same column find maximum number

*/