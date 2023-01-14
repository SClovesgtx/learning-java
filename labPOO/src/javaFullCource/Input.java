package javaFullCource;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é seu nome?");
		String name = scanner.nextLine();
		System.out.println("Olá " + name + "! :)");
		System.out.println("Qual a sua idade?");
		int age = scanner.nextInt();
		System.out.println("Uhmm, " + age + " é a idade de cristo. ;P");
	}

}
