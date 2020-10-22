package java_proj;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FsaveTest {

	public static void main(String[] args) {
		/* 필요한 변수*/
		//경로변수
		String fn="D:\\java\\ws\\java_proj\\src\\java_proj\\filename.txt";
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
			String[]mems = {"정진관","정몽주","정준혁"};
			FileOutputStream fos = new FileOutputStream(fn);
			//스트림이 저장하는 객체
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//파일로 저장하는 객체
			ObjectOutputStream out = new ObjectOutputStream(bos);
			//저장
			out.writeObject(mems);
			//메모리에서 파일관련내용은 제거
			out.close();
		} catch (Exception e) { //Exception e: 예외정보를 담은 객체
			// TODO Auto-generated catch block
		// 	e.printStackTrace(); 이건 오류날때 뜨는거 (거의 템플릿?)
			System.out.printf("파일저장오류: %s",e.getMessage());
		}
	}

}
