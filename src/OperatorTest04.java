
public class OperatorTest04 {

	public static void main(String[] args) {
		
		int score1 = 10;
		int score2 = 3;
		
		// 복합 할당 연산자
		System.out.println("+= 연산 결과: " + (score1 += score2));		//score1 = score1 + score2;
		System.out.println("-= 연산 결과: " + (score1 -= score2));		//score1 = score1 - score2;
		System.out.println("*= 연산 결과: " + (score1 *= score2));		//score1 = score1 * score2;
		System.out.println("/= 연산 결과: " + (score1 /= score2));		//score1 = score1 / score2;
		System.out.println("%= 연산 결과: " + (score1 %= score2));		//score1 = score1 % score2;
	}

}
