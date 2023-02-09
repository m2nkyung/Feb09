//   키보드에서 영문자 한자를 입력받아 소문자는 대문자로 , 대문자는   소문자로 변환하여 출력하는 프로그램.

import java.util.Scanner;
public class Week1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String s = "";
		
		do {
			
			System.out.print("문자를 입력하세요 : ");
			s = input.next();
			
			if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
				System.out.println(s.toUpperCase());
			} else if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
				System.out.println(s.toLowerCase());
			} else if(s.charAt(0) == 0) {
				break;
			} else {
				System.out.println("영문자가 아닙니다");
			}
		} while(s.charAt(0) != '0');
	}
}