package package_1;

public class Constructor_2 {

	public void method1()
	{
		System.out.println("Default Method");
	}
	public void method2()
	{
		System.out.println("One Parameterized Method");
	}
	public void method3()
	{
		System.out.println("Two Parameterized Method");
	}
	public void method4()
	{
		System.out.println("Three Parameterized Method");
	}
	public void method5()
	{
		this.method4();
		this.method1();
		this.method2();
		this.method3();
		System.out.println("Four Parameterized Method");
	}
	
	public static void main(String[] args) {
		Constructor_2 obj = new Constructor_2();
		obj.method5();

	}

}
