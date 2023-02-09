//성과 이름을 키보드로부터 입력받아 출력하시오.

import java.util.Scanner;
public class Week2_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String name = "";
		
		System.out.print("성을 입력하세요 : ");
		name += input.next();
		System.out.print("이름을 입력하세요 : ");
		name += input.next();
		
		System.out.println(name);
	}
}