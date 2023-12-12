package program;

public class PrintFrom1to10And10To1UsingSingleLoop {

	public static void main(String[] args) {
	
		int y=1;
		
		for(int i=1;i>0;i+=y)
		{
			if(i==10)
				y=-1;
			System.out.print(i+" ");
		}
	}
}