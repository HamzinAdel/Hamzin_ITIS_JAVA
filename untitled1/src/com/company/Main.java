package com.company;
import java.util. Scanner;
public class Main {
	private static Scanner read;

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		while (true) {
			read = new Scanner(System.in);
			int first, second;
			int result = 0;
			String operator;
			String str;

			System.out.println("Введите первое число");
			first = num.nextInt();
			System.out.println("Оператор");
			operator = read.next();
			System.out.println("Введите второе число");
			second = num.nextInt();
			if (operator.equals("*")) {
				result = first * second;
				System.out.println("= " + (first * second));
			}
			if (operator.equals("+")) {
				result = first + second;
				System.out.println("= " + (first + second));
			}
			if (operator.equals("-")) {
				result = first - second;
				System.out.println("= " + (first - second));
			}
			if (operator.equals("/")) {
				result = first / second;
				System.out.println("= " + (first / second));
			}
			System.out.println("Cбросить или продолжить вычеслять(Введите да или нет?)");
			str = num.next();
			if (str.equals("Да")) {

				System.out.println("Ответ=" + result);
			} else if (str.equals("Нет")) {
				while (str.equals("Нет")) {
					System.out.println("Ответ=" + result);
					System.out.print("Введите оператор");
					operator = num.next();
					System.out.println("Введите второе число");
					second = num.nextInt();
					if (operator.equals("*")) {
						result = first + second;

					} else if (operator.equals("+")) {
						result = first + second;
					} else if (operator.equals("-")) {
						result = first + second;

					} else if  (operator.equals("/")) {
						result = first + second;
					} else {
						System.out.println("Error");
					}
					System.out.println("Cбросить или продолжить вычеслять(Введите да или нет?)");
					str = num.next();
					if (str.equals("Да")) {
						System.out.println("Ответ=" + result);
					}
				}
			}
		}
	}
}
