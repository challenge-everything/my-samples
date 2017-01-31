package project.kage.example.hello;

public class HelloWorld {

	public static void main(String[] args) {

		HelloWorld main = new HelloWorld();
		System.out.println("+++ " + main.execute());
	}

	String execute() {
		return "Hello World!";
	}

}
