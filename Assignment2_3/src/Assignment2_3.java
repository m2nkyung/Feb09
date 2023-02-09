//평균을 구하려는 두수를 setter 에서 난수(1~10사이의 수)로 입력받아   평균을 구하시오.

public class Assignment2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Average av = new Average();
		av.setN1();
		av.setN2();
		
		System.out.println("난수로 발생한 수 : " + av.toString());
		System.out.println("두 수의 평균 : " + av.getAv());
	}
}