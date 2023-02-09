//Arrays.toString(배열 이름) : [ … ] 형태로 배열 원소가 출력됨
import java.util.Arrays;
public class Week3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iArr = {10, 20, 30, 40, 50};
		String[] sArr = {"a", "b", "c", "d", "e"};
		
		System.out.println("FOR-EACH문으로 출력");
		
		for(int i : iArr) {
			System.out.print(i + "\t");
		}
		
		for(String s : sArr) {
			System.out.print(s + "\t");
		}
		
		System.out.println("\nArray.toString() 이용");
		System.out.println(Arrays.toString(iArr));
		System.out.println(Arrays.toString(sArr));
	}
}