
public class PromotionTest03 {

	public static void main(String[] args) {
		char charA = 'A';
		int intA = charA;
		System.out.println("문자A(char) -> 정수(int) : " + intA);
		
		int intZ = 90;
		char charZ = (char) intZ;
		System.out.println("정수90(char) -> 문자Z(char) : " + charZ);
	}

}
