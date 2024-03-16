
public class ifTest03 {

	public static void main(String[] args) {
		/* (if~else if문)
		 * 
		 * if(조건식1) {
		 * 		수행문1;
		 * } else if(조건식2) {
		 * 		수행문2;
		 * } else if(조건식3) {
		 * 		수행문3;
		 * } else {
		 * 		기본 수행문;
		 * }
		 */
		int javaScore = 89;
		
		if(javaScore >= 90) {
			System.out.println(javaScore + "점은 A등급입니다.");
		} else if(javaScore >=80) {
			System.out.println(javaScore + "점은 B등급입니다.");
		} else if(javaScore >=70) {
			System.out.println(javaScore + "점은 C등급입니다.");
		} else if(javaScore >=60) {
			System.out.println(javaScore + "점은 D등급입니다.");
		} else {
			System.out.println(javaScore + "점은 E등급입니다.");
		}
	}

}
