package java_proj;

import java.io.BufferedInputStream;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class FileRead {

	public static void main(String[] args) {
		//스트림 데이터를 파일에서 읽어와서 배열로 만들기
/*1.필오한 변수*/
		//경로변수
		String fn="D:\\java\\ws\\java_proj\\src\\java_proj\\filename.txt";
		//2. 파일읽기
		try {
			
			//스트림화객체
			FileInputStream fis = new FileInputStream(fn);
		//스트림이 저장하는 객체
		BufferedInputStream bis = new BufferedInputStream(fis);
		//스트림객체를 자바객체화
		ObjectInputStream in = new ObjectInputStream(bis);
		//자바 배열화
		Object obj = in.readObject();//앞에 Object는 다 참조할 수 있어서, 강제형변환 (in 뒤로) 함.. 오브젝터 변수가 참조한 스트링배열을 강제 형변환으로 스트링배열로 연결. 
		String[] mems = (String[])obj;
		//배열출력
		System.out.println("==명단출력==");
		for (int i = 0; i < mems.length; i++) {
				System.out.printf("%s.%s\n",(i+1),mems[i]);
		}
			
		} catch (Exception e) {
		//Exception e: 예외정보를 담은 객체
			System.out.printf("파일저장오류: %s \n",e.getMessage());
		}
	}

}
