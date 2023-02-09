//주민등록번호(123456-1234567) 를 입력받아 여자인지 남자인지를 판별하여 출력하시오.

import java.util.Scanner;
public class Week2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String s;
		String contin = "y";

		while(contin.equals("y")) {
			
			System.out.print("당신의 주민번호를 입력하세요 : ");
			s = input.next();
			
			if(s.charAt(7) == '1' || s.charAt(7) == '3') {
				System.out.println("당신은 남자입니다");
			} else if(s.charAt(7) == '2' || s.charAt(7) == '4') {
				System.out.println("당신은 여자입니다.");
			} else {
				System.out.println("유효하지 않은 주민번호입니다.");
			}
			
			System.out.print("입력을 계속하시겠습니까? (y/n)");
			contin = input.next();
		}
	}
}