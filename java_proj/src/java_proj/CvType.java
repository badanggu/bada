package java_proj;

public class CvType {

	public static void main(String[] args) {
		/*String 수를 int로 변환
		 * int 수를 String 으로 변환
		 * 강제로 형변환
		 */
		String strNum = "777"; //Integer.parseInt(수문자열값):수문자열값을 정수화해서 남김,리턴해준다
		int intNum = Integer.parseInt(strNum);//String을 int로
		System.out.printf("intNum : %d",intNum);
		
		String strNum2 = String.valueOf(intNum);//int 를 String으로(꼭 int만 넣진 않아)
 	System.out.printf("strNum : %s",strNum);//String.valueOf(String으로 만들 객체)

	double dbNum =123.456;
	int intNum2 = (int)dbNum;//  (int)dbNum---(강제로 변환할 타입)수=> 수를 강제로 다른타입으로 변환해서 리턴
	System.out.printf("intNum2 : %s",intNum2);
	
	}

}
