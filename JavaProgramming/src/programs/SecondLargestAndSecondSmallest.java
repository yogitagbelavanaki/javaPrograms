package programs;

public class SecondLargestAndSecondSmallest {

	public static void main(String[] args) {
		
		int[] arr= {28,45,36,102,87,66,55,99,12};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
                    arr[j]=temp;
				}
			}
		}
		for(int sorted :arr) {
			System.out.println(sorted);
		}

	}

}
