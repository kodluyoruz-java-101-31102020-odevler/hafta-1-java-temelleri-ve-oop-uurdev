package com.project.weekone.questions.questionone;

import java.util.Scanner;

public class QuestionOne {
    /*
     * TODO : Question
     * 
     * String tipinde sabit bir şifre değişkeni oluşturun. Örneğin: String password
     * = "12345"; gibi. Ardından, kullanıcıdan klavyeden bir şifre girmesini
     * isteyin. Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın. Eğer, iki
     * değer birbirine eşitse ekrana "Giriş Başarılı!", değilse "Giriş Başarısız"
     * yazdırın.
     */
    public static void main(String[] args) {
	if (validateAuthenticationUser()) {
	    System.out.println("Login is successful !");
	} else {
	    System.out.println("Wrong password :(");
	}
    }

    public static boolean validateAuthenticationUser() {
	String defaultSystemPassword = "12345";
	if (defaultSystemPassword.equals(scanUserPassword())) {
	    return true;
	} else {
	    return false;
	}
    }

    public static String scanUserPassword() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Hey ! Welcome please write your system password...");
	String userPassword = scanner.nextLine();
	scanner.close();
	return userPassword;
    }

}
