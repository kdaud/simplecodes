package myresource;

public class Subject {
	public static void main(String [] args) {
		
		Maths obj = new Maths();
		obj.call();
		obj.coursecode();
		myCarrier();
		myLag();
	}
	static void myCarrier() {
		String obj = new String();
		obj="Kakumirizi Daud";
		System.out.println("He is called "+obj);
	}
	static void myLag() {
		System.out.println("Hello World!");
	}

}
