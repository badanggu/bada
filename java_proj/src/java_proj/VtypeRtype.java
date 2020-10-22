package java_proj;

public class VtypeRtype {

	public static void main(String[] args) {
		// 값형과 참조형
		/*
		 * 값형 :값이 수
		 * 참조형 :값이 주소를 가지고 있어
		 * 
		 */
		int a =7;
		int b = a;
		System.out.printf("b변경전=a:%s,b:%s \n",a,b);
			b=8;
			System.out.printf("b변경후=a:%s,b:%s \n",a,b);
			
			
			int[] as =new int[1];// int1 이라는게 생겨서 as 에 값을 넣는다
			as[0] = 7;
			int[] bs =as; //주소전달이 되었어
			bs[0] = 8;
			System.out.printf("b변경전=as[0]:%s,bs[0]:%s \n",as[0],bs[0]);
			bs[0]=9;
			System.out.printf("b변경후=as[0]:%s,bs[0]:%s \n",as[0],bs[0]);
				
	}

}
