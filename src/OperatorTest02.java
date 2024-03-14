
public class OperatorTest02 {

	public static void main(String[] args) {
		int javaScore = 83;
		int pythonScore = 100;
		
		System.out.println("두 시험 점수의 합: " + javaScore + pythonScore); // 두 시험 점수의 합: 83100 출력
		
		/* 	+는 산술 연산자로 사용하기도 하지만 문자열과 문자열을 연결하는 연산자로도 사용됨,
		 	문자열과 기본 타입의 데이터가 '+'로 연결되면 먼저 기본 타입의 데이터가 문자열로
		 	변경되고 두 문자열이 '+'에 의해 결합됨.
		 	
		 	'+'가 문자열 결합 연산자가 아닌 더하기 연산자로 동작하려면 괄호를 이용해 더하기 연산이
		 	먼저 처리되도록 해야함. 
		 	ex) System.out.println("두 시험 점수의 합: " + (javaScore + pythonScore));
		 	괄호를 이용하면 여러 연산자가 섞여 있을 때 연산자의 우선 순위를 지정할 수 있음.
		 */
	}

}
