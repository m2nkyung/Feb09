//입력받은 문자열을 역순으로 화면에 출력하시오

import java.util.Scanner;
public class Assignment2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		String s = input.next();
		
		for(int i = (s.length() - 1); i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}