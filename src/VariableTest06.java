
public class VariableTest06 {

	public static void main(String[] args) {
		System.out.println("[교환 전]");
		int javaScore = 83; 		// 변수 선언, 초기화
		int pythonScore = 100; 		// "
		System.out.println("javaScore: " + javaScore);		// javaScore(83) 출력
		System.out.println("pythonScore: " + pythonScore);  // pythonScore(100) "
		
		System.out.println("---------------");
		
		System.out.println("[교환 후]");
		int temp; 						// 변수 선언
		temp = javaScore;				// temp에 javaScore의 값(83)을 저장, temp의 값은 83이 됨
		javaScore = pythonScore;		// javaScore에 pythonScore의 값(100)을 저장, jS의 값은 100이 됨.
		pythonScore = temp;				// pythonScore에 temp의 값(83)을 저장, pS의 값은 83이 됨.
		System.out.println("javaScore: " + javaScore); 		// javaScore(100) 출력
		System.out.println("pythonScore: " + pythonScore);	// pythonScore(83) 출력
	}

}
