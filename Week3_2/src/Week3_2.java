//길이가 2인    타입의 참조 변수 배열을 생성      객체를 생성해서 배열의 각 요소에 저장 

public class Week3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV[] tArr = new TV[3];
		
		for(int i = 0; i < 3; i++) {
			tArr[i] = new TV();
			tArr[i].setChannel(10);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(i + ": " + tArr[i].getChannel() + "\t");
			tArr[i].channelUp();
		}

		for(int i = 0; i < 3; i++) {
			System.out.print(i + ": " + tArr[i].getChannel() + "\t");
		}
	}
}