package program;

public interface ConcreteMethods {
	
	static final int x=10;
	
	public static void wow()
	{
		System.out.println("Angel what are you doing?");
	}
	
	default void sup()
	{
		System.out.println("Angel is cute");
	}
	
	public static void main(String[] args) {
		
		wow();
		System.out.println(x);
	}
}
