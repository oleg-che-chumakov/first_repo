package test1;

public class Hello {
	public static void main (String[] args) {
		System.out.println("Hello world!");
		
		String name = AnotherClass.getName();
		System.out.println("Name = "+name);
		
		int age = AnotherClass.getAge();
		System.out.println("Age = "+age);

}
}