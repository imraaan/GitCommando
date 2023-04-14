package java_sess;

public class jagged {
	public static void main(String[] args) {
	int[][]  jaggarray= { {1,2}, {1,2,3,4}, {1,2,3} };
	for (int i = 0; i<jaggarray.length; i++) {
		for(int j=0; j< jaggarray[i].length; j++) {
			System.out.print(jaggarray[i][j]+" ");
		}
		System.out.println();
	}
}
}