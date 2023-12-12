package program;

public interface InterfaceProgram {

	public void sample();
	
	final int x=10;
}

class implementationClass implements InterfaceProgram{

	@Override
	public void sample() {
		
		System.out.println("Over ridden");
		
	}
	
	public static void main(String[] args) {
		
		implementationClass imp=new implementationClass();
		imp.sample();
	}
}