package demoproject;

public class MainClass {

	public static void main(String[] args) {
		int a=253;
		int b=50;
		
		Calculator cal = new Calculator();
		System.out.println(cal.multiply(a, b));
		System.out.println(cal.division(a, b));

	}

}
