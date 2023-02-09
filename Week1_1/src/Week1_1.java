//while문을 이용하여 정수 여러개를 입력받고 평균을 출력하시오. 0 이 입력되면 입력을 종료한다. 

import java.util.Scanner;
public class Week1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int i = -1;
		int sum = 0;
		int count = -1;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		while(i != 0) {
			i = input.nextInt();
			sum += i;
			count++;
		}
		
		System.out.println("입력한 수의 갯수 : " + count);
		System.out.println("평균 : " + (sum / count));
	}
}