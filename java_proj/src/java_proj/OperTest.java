package java_proj;

public class OperTest {

	public static void main(String[] args) {
		
		int[] ints = {1,2,3};
		//삼항연산자 이용해서 배열 반복하는데, ints[0]이 1이면 일 출력, 2면 이 출력
 System.out.println("==일이삼출력==");
  for (int i = 0; i < ints.length; i++) {
	System.out.printf("%s:%s\n",ints[i],ints[i]==1?"일":ints[i]==2?"이":"삼");

   
  
  
  
  } //%s 는 ints[i] 순서대로 연산을 해보는데 처음에 1이면 일이 나오고, 또 반복해서 (중첩반복문) 두번째 ==2 를 대입해본다 근데 맞으면 '이'가 나오는거고, 아니면 '삼'이 나와, 3번째꺼에서 1도 아니고 2도 아니니까 삼이 나옴

  String a1="신민철";
  String a2="신민철";
  if (a1==a2) {System.out.println("a1과 a2참조같음");
	
  }else {
  	System.out.println("다름");
  	
  }
  
  if (a1.equals(a2)) {
	System.out.println("둘의 문자열이 같음");
}    
  String a3= new String("신민철");
  String a4= new String("신민철");
  
  if (a3==a4) {
	  System.out.println("둘 참조같음");
  } else {System.out.println("참조다름");}
  
  if (a3.equals(a4)) {
	  System.out.println("둘 문자열같음");
  }
  

  for (int i = 2; i <=9; i++) {
	 System.out.println(i+"단");
	
for (int j = 1; j <=9; j++) {
	System.out.println(i +"×"+j +"="+i*j);
	
}

}

 
}
  
	}


