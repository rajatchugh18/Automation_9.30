package package_1;

public class Constructor_1 {

	
	public Constructor_1 ()
	{
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}
	public Constructor_1 (int a)
	{
		this();
		System.out.println("One Parameterised Constructor");
	}
	public Constructor_1 (int a, int b)
	{
		this(1);
		System.out.println("Two Parameterised Constructor");
	}
	public Constructor_1 (int a, int b, int c)
	{
		this(1,2);
		System.out.println("Three Parameterised Constructor");
	}
	public Constructor_1 (int a, int b, int c, int d)
	{
		System.out.println("Four Parameterised Constructor");
	}
	public static void main(String[] args) {
		
		Constructor_1 obj = new Constructor_1(1,2,3);

	}

}
