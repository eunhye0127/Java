package ch01;

public class ValueAssignment {

	public static void main(String[] args) {
		
		//배열의 값 대입 방법1
		int[] array1 = new int [3];
		array1[0]= 3;
		array1[1]= 4;
		array1[2]= 5;
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]+" ");
		
		//배열의 값 대입 방법2
		int[] array2 = new int[] {3,4,5};
		System.out.println(array2[0]+" "+array2[0]+" "+array2[0]+" ");
		
		//배열의 값 대입 방법3
		int[] array3 = {3, 4, 5};
		System.out.println(array3[0]+" "+array3[0]+" "+array3[0]+" ");
	}
}
