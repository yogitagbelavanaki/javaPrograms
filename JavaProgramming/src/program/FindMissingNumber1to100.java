package program;

public class FindMissingNumber1to100 {
	
	public static void main(String[] args) {
		int[] array= new int[101];
		for (int i = 1; i < array.length; i++) {
			array[i]=i;
		}
		
		array[35]=45;
		
		for (int i = 1; i <array.length; i++) {
			if(!(array[i]==i)) {
				System.out.println(i+" is missing in the array");
			}else {
				System.out.println(array[i]);
			}
		}
	}
}