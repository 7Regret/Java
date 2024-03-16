
public class OperatorTest07 {

	public static void main(String[] args) {
		int gender = 'M';
		int score = 87;
		
		System.out.println(gender == 'F' && (score%0) == 0);
		//  AND연산은 연산자를 중심으로 양쪽의 조건이 모두 참(true)일 때 전체 결과를 참(true)로 처리.
		
		System.out.println(gender == 'M' || (score%0) == 0);
		//  OR연산은 연산자를 중심으로 양쪽의 조건 중에 하나만 참(true)이면 전체 결과를 참(true)로 처리.

	}

}
