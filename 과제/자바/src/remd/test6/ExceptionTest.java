package remd.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 ~ 5 까지의 정수 입력 : ");
		int data = sc.nextInt();
		double result = 0;
		
		try {
			result = new Calculator().getSum(data);
			System.out.printf("결과값 : %.1f", result);
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}
	}
}
