//500원, 100원, 50원, 10원짜리 동전의 갯수를 입력하여   돈의 액수를 계산하는 프로그램.

import java.util.Scanner;
public class Week1_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int co_500, co_100, co_50, co_10;
		
		System.out.print("500원 동전 갯수 : ");
		co_500 = input.nextInt();
		System.out.print("100원 동전 갯수 : ");
		co_100 = input.nextInt();
		System.out.print("50원 동전 갯수 : ");
		co_50 = input.nextInt();
		System.out.print("10원 동전 갯수 : ");
		co_10 = input.nextInt();
		
		int sum = co_500 * 500 + co_100 * 100 + co_50 * 50 + co_10 * 10;
		
		System.out.println("금액은 " + sum + "원입니다.");
	}
}