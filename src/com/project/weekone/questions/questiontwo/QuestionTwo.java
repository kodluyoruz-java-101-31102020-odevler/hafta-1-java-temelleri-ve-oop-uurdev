package com.project.weekone.questions.questiontwo;

import java.util.Scanner;

public class QuestionTwo {

    public static void main(String[] args) {
	/*
	 * 
	 * TODO Question two
	 * 
	 * Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir
	 * program yazmanız bekleniyor. Program aşağıdaki özellikleri sağlamalıdır.
	 * 
	 * Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme Kullanıcıya 4
	 * işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama,
	 * 2-Çıkarma vb... Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini
	 * isteyin. Bu girilen iki sayıyı değişkenlerde saklayın. Seçilen işlem tipine
	 * göre matematiksel işlemi yapın ve konsol ekranına yazdırın.
	 * 
	 * 
	 */

	Scanner scanner = new Scanner(System.in);
	System.out.println("Please write first number : ");
	int firstNumber = scanner.nextInt();
	System.out.println("Please write second number : ");
	int secondNumber = scanner.nextInt();
	System.out.println("Nice please write operator action , Example : + , - , * , /");
	char operator = scanner.next().charAt(0);
	scanner.close();
	switch (operator) {
	case '+':
	    Arithmetic addition = (int a, int b) -> (a + b);
	    System.out.println("Addition = " + addition.operation(firstNumber, secondNumber));
	    break;
	case '-':
	    Arithmetic subtraction = (int a, int b) -> (a - b);
	    System.out.println("Subtraction = " + subtraction.operation(firstNumber, secondNumber));
	    break;
	case '*':
	    Arithmetic multiplication = (int a, int b) -> (a * b);
	    System.out.println("Multiplication = " + multiplication.operation(firstNumber, secondNumber));
	    break;
	case '/':
	    Arithmetic division = (int a, int b) -> (a / b);
	    System.out.println("Division = " + division.operation(firstNumber, secondNumber));
	    break;

	default:
	    System.out.println("Opss ! invalid operator");
	    break;
	}

    }

}
