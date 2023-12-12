package program;

public class CommonElementsIn3Arrays {
	public static void main(String[] args) {
		int[] array1= {2,4,6,8};
		int[] array2= {2,3,5,7,8};
		int[] array3= {1,2,3,5,7,8,9};
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
				for (int j2 = 0; j2 < array3.length; j2++) {
					if(array2[j]==array3[j2]) {
						System.out.println(array3[j2]);
					}
				}	
				}
			}
		}
	}

}
