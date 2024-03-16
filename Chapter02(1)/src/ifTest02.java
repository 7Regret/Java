
public class ifTest02 {

	public static void main(String[] args) {
		/* if~else문
		 * if(조건식) {
		 * 		수행문1; // 조건식이 true인 경우
		 * } else { 
		 * 		수행문2; // 조건식이 false인 경우
		 * }
		 */
		int javaScore = 40;
		
		if(javaScore >= 60) {
			System.out.println(javaScore + "점은 합격입니다.");
		} else {
			if(javaScore <=30) {
				System.out.println(javaScore + "점은 페널티 대상입니다.");
			} else {
				System.out.println(javaScore + "점은 불합격입니다.");
			}			
		}
	}

}
