//일차배열에 1~10 사이의 난수를 입력받아 출력하고, 입력한 수들의 합과 평균을 구하시오

import java.util.*;
public class Assignment2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[100];
		int sum = 0;
		
		System.out.println("일반 For문으로 발생된 수 ");
		
		for(int i = 0; i < 100; i++) {
			arr1[i] = (int) (Math.random() * 100);
			System.out.print(arr1[i] + "\t");
			sum += arr1[i];
			
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / 100);
		
		
		System.out.println("For-each문으로 발생된 수 ");
		int[] arr2 = new int[100];
		int count = 0;
		int sum2 = 0;
		
		for(int i = 0; i < 100; i++) {
			arr2[i] = (int) (Math.random() * 100);
		}
		
		for(int i : arr2) {
			System.out.print(i + "\t");
			count++;
			sum2 += i;
			
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
		System.out.println("합계 : " + sum2);
		System.out.println("평균 : " + sum2 / 100);
	}
}