// Average 클래스 안에 다음과 같이 getAverage() 를 중복 정의하고 테스트하시오.

public class Week2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Average av = new Average();
		int i = 10;
		int j = 20;
		int k = 30;
		
		System.out.println("두 수의 평균은 : " + av.getAverage(i, j));
		System.out.println("세 수의 평균은 : " + av.getAverage(i, j, k));
	}
}