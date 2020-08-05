package package_1;

public class Arith_2 {

	public int sum(int a1, int a2)
	{
		int c = a1 + a2;
		System.out.println("Sum = " + c);
		return c;
	}
	
	public int sub(int b1, int b2)
	{
		int c = b1 - b2;
		System.out.println("Sub = " + c);
		return c;
	}
	
	public int mul(int c1, int c2)
	{
		int c = c1*c2;
		System.out.println("Sub = " + c);
		return c;
	}
	
	public void div(int d1, int d2)
	{
		int c = d1 / d2;
		System.out.println("Division = " + c);
	}
	
	
	public static void main(String[] args) {
	
	Arith_2 obj = new Arith_2();
	
	int sub1 = obj.sub(10, 2);
	int sum = obj.sum(sub1, 2);
	int sub2 = obj.sub(sum, 2);
	int mul = obj.mul(sub2, 2);
	
	obj.div(mul, 2);
	
	}
}
