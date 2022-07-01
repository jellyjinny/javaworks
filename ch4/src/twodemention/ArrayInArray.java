package twodemention;

public class ArrayInArray {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];
		
		//정수형 배열은 
		System.out.println(mathScores.length);      //행의 길이
		System.out.println(mathScores[0].length);   //열의 길이
		System.out.println(mathScores[1].length);   //열의 길이
		
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]=" 
							+ mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0; i<englishScores.length; i++) {
			for(int j=0; j<englishScores[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "]=" 
							+ englishScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {
				{95, 98},
				{92, 96, 80}
		};
		
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "]=" 
							+ javaScores[i][j]);
			}
		}
	}
}
