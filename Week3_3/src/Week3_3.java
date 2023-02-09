//   Book class 를 이용하여 크기가 2인 Book 객체 배열을 만들고, 사용자로부터 책의 제목과 저자를 입력받아 배열을 출력하시오.

import java.util.Scanner;
public class Week3_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Book[] b = new Book[2];
		
		b[0] = new Book();
		System.out.print("제목>>");
		b[0].setTitle(input.next());		
		System.out.print("저자>>");
		b[0].setAuthor(input.next());
		
		
		b[1] = new Book();
		System.out.print("제목>>");
		b[1].setTitle(input.next());		
		System.out.print("저자>>");
		b[1].setAuthor(input.next());
		
		System.out.println("(" + b[0].getTitle() + ", " + b[0].getAuthor() + ")");
		System.out.println("(" + b[1].getTitle() + ", " + b[1].getAuthor() + ")");
	}
}