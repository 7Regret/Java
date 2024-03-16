
public class OperatorTest05 {

	public static void main(String[] args) {
		int score = 20;
		System.out.println("score 값: " + score);	// 20
		++score;	// 전위연산(++score)의 경우, score 변수의 값을 먼저 증가 시킨 후 score 변수값을 사용.
		System.out.println("score 값: " + score);	// 21
		score++;	// 후위연산(score++)의 경우, score 변수에 할당된 값을 먼저 사용 후, 다음 라인의 코드 넘어갈 때 값을 증가. 그렇기에 이 라인의 변수값은 21이다.
		System.out.println("score 값: " + score);	// 22
		
		--score;
		System.out.println("score 값: " + score);
		score--;
		System.out.println("score 값: " + score);

	}

}
