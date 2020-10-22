package java_proj;

public class ArrayCopyT {

	public static void main(String[] args) {
		// movies2 배열에 추가할 배열
		String[] movies = {"반교","국제수사","포드페라리"};
		String[] movies2 = new String[10];
		//arraycopy()
		//System.arraycopy(src(복사할배열), srcPos(복사할값의 시작인덱스번호), dest(복사당할배열), destPos(복사당할 배열의 위치->0이면 처음꺼부터 다 들어온다는소리), length-개수);		
		System.arraycopy(movies, 0, movies2, 0, movies.length);	
		//
		for(String pstr:movies2) {
			System.out.printf("-%s\n",pstr);
		}
	}

}
