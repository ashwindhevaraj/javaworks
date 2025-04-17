package Teachings;

public class innerclass1 {
public class innerclass2{
	public void test() {
		System.out.println("Method inside innerclass2");	
		}
}
public static void main(String args[]) {
	new innerclass1().new innerclass2().test();
}
}

// op method inside inner innerclass2