package programs;

public class pyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1, i=0, j=0;
		for(i=0;i<4;i++) {
			for(j=1;j<=4-i;j++) {
				System.out.print(num);
				System.out.print("\t");
				num++;
			}
			System.out.println();
		}
		
	}

}

/*
1 2 3 4
5 6 7
8 9
10
*/