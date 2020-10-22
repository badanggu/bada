package java_proj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;
import java.util.Scanner;

public class TestMenu2 {

   public static void writeFile(Object obj) {
      
      String fn = "D:\\java\\ws\\java_proj\\src\\java_proj\\namelist4.txt";
      try {
         // 스트림화 : 데이터직렬화 바이트단위로 나열
         FileOutputStream fos = new FileOutputStream(fn);
         // 스트림버퍼 : 스트림을 담는 역할
         BufferedOutputStream bos = new BufferedOutputStream(fos);
         // 오브젝트화 : 
         ObjectOutputStream out = new ObjectOutputStream(bos);
         // 객체를 유지하면 저장
   
         out.writeObject(obj);
            out.close();

         } catch (Exception e) {

         System.out.printf("예외 : %s", e.getMessage());

         }

      }

      // 파일읽기
      //static 메시지 실행 후 변환값의 타입 메서드이름()
      public static String[][] readFile() {
      // 스트림데이터를 파일에서 읽어와서 배열로 만들기
      /* 1. 필요한 변수 */
      // 경로변수
      String fn = "D:\\java\\ws\\java_proj\\src\\java_proj\\namelist4.txt";
      // 2. 파일읽기
      try {
         // 스트림화객체
         FileInputStream fis = new FileInputStream(fn);
         // 스트림을 저장하는 객체
         BufferedInputStream bis = new BufferedInputStream(fis);
         // 스트림객체를 자바객체화
         ObjectInputStream in = new ObjectInputStream(bis);
         // 자바 배열화
         Object obj = in.readObject();
      // 오브젝트 변수가 참조한 스트링배열을 강제형변환으로 스트링배열변수로 연결.
         String[][] mems = null;
         if (!Objects.isNull(obj)) {
            mems = (String[][])obj;
            // 현재 개수
            int length = 0;
            for (int i = 0; i < mems.length; i++) {
            if (Objects.isNull(mems[i][0])) {
            length = i+1;
            }
            }   
         System.out.println("length : " + length);
            return mems;
         } 
            return new String[4][3];
         } catch (Exception e) { 
         // Exception e : 예외정보를 담은 객체 
         System.out.printf("파일저장오류 : %s \n", e.getMessage());
         }
         return null; 
         }
         public static void main(String[] args) {
         // 시작
         // 읽기
         System.out.println("== PROGRAM START! ===");
         // 컴파일및 콘솔에서 실행 : Ctrl + f11;
         // 초기
         Scanner s = new Scanner(System.in);
         // 이름관리프로그램
         String[][] names = readFile();
         int i = 0;
         if (Objects.isNull(names)) {
            names = new String[4][3];
         } else {
         for (int j = 0; j < names.length; j++) {
        	 System.out.printf(" +───────────────────────────────+\n");
        	 System.out.printf(" |  %4s | %6s | %6s   |\n", names[j][0],  names[j][1], names[j][2]);
         if (Objects.isNull(names[j][0])) {
         i = j;
         break;
            }
         }
         }
         // 메뉴변수
         String strM = "0"; // 나가기
         // do ~ while : 한번은 실행되는 반복문
                  do {
         // 메뉴 선택
                	  System.out.println("       ┌─────────────────┐");
                      System.out.println("       | 학력조회프로그램        |");
                      System.out.println("       ├─────────────────┤");
                      System.out.println("       |     1. 입력           |");
                      System.out.println("       ├─────────────────┤");
                      System.out.println("       |     2. 저장           |");
                      System.out.println("       ├─────────────────┤");
                      System.out.println("       |     3. 조회           |");
                      System.out.println("       ├─────────────────┤");
                      System.out.println("       |     4. 종료           |");
                      System.out.println("       └─────────────────┘");
                      System.out.print("※선택 : ");

         strM = s.nextLine();
      // 메뉴선택에 따라 실행
         switch (strM) {
         case "1":
            // 배열이 꽉찼을때 중지
         System.out.println(names.length - 1);
         if (i > names.length - 1) {
         System.out.println("등록불가!");
         } else {
         System.out.println("== 1.등록 ==");
         System.out.print("이름 : ");
         names[i][0] = s.nextLine();
         System.out.print("사는곳 : ");
         names[i][1] = s.nextLine();
         System.out.print("학력 : ");
         names[i][2] = s.nextLine();
         
         i++;
         }
         break;
   
         case "2":
         // 목록선택
         System.out.println("== 2.목록 ==");
         if (Objects.isNull(names)) {
   
         break;
            }
            for (int j = 0; j < names.length; j++) {
            // Objects.isNull(names[j])
            // Objects.isNull(변수이름) : 값이 null인지 확인
            // null이면 true null이 아니면 false
            if (Objects.isNull(names[j][0]) || names[j][0].equals("")) {
            } else {
            // 목록출력
            System.out.printf("%s.이름 : %s (사는곳:%s) (학력:%s) \n", j + 1, names[j][0], names[j][1],names[j][2]);
             }
         }
         break;
   
         default:
         break;
         }
         } while (!strM.equals("4"));
         // 종료
   
         writeFile(names);
   
         // 쓰기
   
         System.out.println("== PROGRAM END! ===");
         
      }
}