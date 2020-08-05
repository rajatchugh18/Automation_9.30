package package_1;

public class Student {

	int rollno, age;
	
	public void method1() {
		System.out.println("Welcome All!");
	}
	
	public void method2() {
		System.out.println("Automation is easy.");
	}
	
	public static void main(String[] args) {
		
	Student deepak = new Student();
	
	deepak.rollno = 10;
	deepak.age = 20;
	
	System.out.println("Roll Number of the student is : " + deepak.rollno);
	System.out.println("Age of the student is : " + deepak.age + " years");
	deepak.method1();
	deepak.method2();

	}

}
