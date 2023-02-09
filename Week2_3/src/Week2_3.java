//1~100 의 난수 100개를 발생시켜 수들의 합과 평균을 구하시오

import java.util.*;
public class Week2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tmp;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				tmp = (int) (Math.random() * 101);
				System.out.print(tmp + "\t");
				sum += tmp;
			}
			System.out.println();
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / 100);
	}
}