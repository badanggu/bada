package java_proj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;
import java.util.Scanner;

public class TestMenu {

	public static void main(String[] args) {
		// 테스트
		//System.out.println(6);
		//시작
		System.out.println("== PROGRAM START! ===");
		//컴파일 및 콘솔에서 실행 Ctrl+ f11
		Scanner s =new Scanner(System.in);
		//이름관리프로그램
		String[] names =new String[5];//네임이라는 문자배열은 14개까지 받겠다
		//메뉴변수 이름 14개만 넣어라
		String strM = "";//나가기
		//do~while :한번은 실행되는 반복문
		int i =0;
		do {
			System.out.println("==menu==");
			System.out.println("==0.나가기==");
			System.out.println("==1.등록==");
			System.out.println("==2.저장==");
			System.out.println("==3.불러오기==");
			System.out.print("선택:");
			//메뉴선택하게한다 -나가기 전까지 계속 나옴 
			strM=s.nextLine();//첫 메인화면에서 입력값을 받으면 그때부터 아래 스위치문이 작동
			
			switch (strM) {
			case "1":
			  if(i>names.length-1) { //i 가 이름에 넣는 개수보다 큰 수이면 예를 들어 i가 13보다 크면, 등록불가 
					System.out.println("등록불가!");			
				}else {
				System.out.println("==1.등록==");
				System.out.print("이름:");
				names[i++]=s.nextLine();}	//입력받은 값----누적				
				break;
				
			case "2":
				//저장하기
				
				String fon="D:\\java\\ws\\java_proj\\src\\java_proj\\file2.txt";
				//파일로 저장하려면 스트림이 되어야 한다(stream): byte배열화
						//스트림화객체 
						/*try {
							FileOutputStream fos = new FileOutputStream(fn);
						} catch (Exception e) {
							// 예외처리
							e.printStackTrace();
						 * 
						 */
						try {
							
							FileOutputStream fos = new FileOutputStream(fon);
							//스트림이 저장하는 객체
							BufferedOutputStream bos = new BufferedOutputStream(fos);
							//파일로 저장하는 객체
							ObjectOutputStream out = new ObjectOutputStream(bos);
							//저장
							out.writeObject(names);
							//메모리에서 파일관련내용은 제거
							out.close();
						} catch (Exception e) { //Exception e: 예외정보를 담은 객체
							// TODO Auto-generated catch block
						// 	e.printStackTrace(); 이건 오류날때 뜨는거 (거의 템플릿?)
							System.out.printf("파일저장오류: %s",e.getMessage());
				}
				break;
				
				
			case "3":
				//저장하기
				
				String fon1="D:\\java\\ws\\java_proj\\src\\java_proj\\file2.txt";
				
				try {
					
					//스트림화객체
					FileInputStream fis = new FileInputStream(fon1);
				//스트림이 저장하는 객체
				BufferedInputStream bis = new BufferedInputStream(fis);
				//스트림객체를 자바객체화
				ObjectInputStream in = new ObjectInputStream(bis);
				//자바 배열화
				Object obj = in.readObject();//앞에 Object는 다 참조할 수 있어서, 강제형변환 (in 뒤로) 함.. 오브젝터 변수가 참조한 스트링배열을 강제 형변환으로 스트링배열로 연결. 
				String[] mems = (String[])obj;
				//배열출력
				System.out.println("==명단출력==");
				for (int j = 0; j < mems.length; j++) {
						System.out.printf("%s.%s\n",(j+1),mems[j]);
				}
					
				} catch (Exception e) {
				//Exception e: 예외정보를 담은 객체
					System.out.printf("파일저장오류: %s \n",e.getMessage());
				}
				break;
				
			default:
				break;
			}
		} while (!strM.equals("0"));
		//종료 ---0이 아닐땐 계속 돈다 (느낌표 =not)
		System.out.println("== PROGRAM END! ===");
		

	}

}
