
public class VariableTest05 {

	public static void main(String[] args) {
		boolean isPassed = true; 		// boolean 참과 거짓의 값을 표현
		char grade = 'A';				// char 한 문자만으로 표현
		byte year = 3;					// byte 1byte(8bit), 정수 타입  
		short javaScore = 17;			// short 2byte(16bit), 정수 타입
		int sumScore = 12045;			// int 4byte(32bit), 정수 타입, 주로 사용되는 타입
		long currenTime = 1234567898L;	// long 8byte(64bit), 정수 타입, 리터럴뒤에 L,l로 마무리.
		float javaAvg = 78.25F;			// float 4byte(32bit), 실수 타입, 리터럴뒤에 F,f로 마무리.
		double examAvg = 76.234522;		// double 8byte(64bit), 실수 타입, 실수는 기본적으로 double타입으로 마무리되기에 float로 변경하려면 F,f를 추가해야함.
		
		System.out.println(isPassed);
		System.out.println(grade);
		System.out.println(year);
		System.out.println(javaScore);
		System.out.println(sumScore);
		System.out.println(currenTime);
		System.out.println(javaAvg);
		System.out.println(examAvg);

	}

}