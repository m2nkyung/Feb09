//for-each 크기가 5인  정수  배열에  정수를  입력받아  배열  원소의  합을  출력 / 크기가 5인  문자열  배열에  이름을  입력받아 출력

import java.util.Scanner;
public class Week2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		String[] sArr = new String[5];
		
		System.out.print("정수를 입력하세요 : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		System.out.println("합은 " + sum);
		
		System.out.print("이름을 입력하세요 : ");
		for(int i = 0; i < sArr.length; i++) {
			sArr[i] = input.next();
		}
		
		System.out.print("입력된 이름은 : ");
		for(String s : sArr) {
			System.out.print(s + "\t");
		}
	}
}