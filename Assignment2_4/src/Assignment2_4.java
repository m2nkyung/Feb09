//이름(name) 과 전화번호(tel)를 입력받아 2개의 Phone 객체를 생성하고 다음과 같이 출력하시오.

import java.util.Scanner;
public class Assignment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름, 전화번호를 입력하세요 : ");
		String n = input.next();
		String t = input.next();
		Phone p = new Phone(n, t);
		
		System.out.println(p.getName() + "의 번호는 " + p.getTel() + "입니다.");
	}
}