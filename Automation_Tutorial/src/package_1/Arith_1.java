package package_1;

public class Arith_1 {

public int sum(int a , int b)
{	
	int c;
	c = a+b;
	System.out.println("Sum = " + c);
	return c;
}
	
public int sub(int a , int b)
{	
	int c;
	c = a-b;
	System.out.println("Subtraction = " + c);
	return c;
}

public int mul(int a , int b)
{	
	int c;
	c = a*b;
	System.out.println("Multiplication = " + c);
	return c;
}

public void div(int a , int b)
{	
	int c;
	c = a/b;
	System.out.println("Division = " + c);
}


public static void main(String[] args) {
	
	Arith_1 obj = new Arith_1();
	
	int sum1 = obj.sum(10, 2);
	int sum2 = obj.sum(sum1, 2);
	int subtraction = obj.sub(sum2, 2);
	int multiplication = obj.mul(subtraction, 2);
	
	obj.div(multiplication, 2);
	
		
	}

}
