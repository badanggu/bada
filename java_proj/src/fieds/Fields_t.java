package fieds;

class Fields {
	//static붙어서 얘는 클래스 멤버 필드: 힙에 한개만 존재(intSi 는 이미 static이라 실행시키면 이미 생김)
	static int intSi=3;
	
	//얘는 인스턴스 멤버 필드: 힙에 new할때마다 생성(새로 생성)
	int Ii =5;
	
}
public class Fields_t {

	public static void main(String[] args) {
		//클래스 멤버 필드 테스트
		//System.out.printf("Fields.intSi: %d\n",Fields.intSi);
	

		
		Fields i01= new Fields();
		i01.Ii=6;
		
		Fields i02= new Fields();
		i02.Ii=2;
		
		Fields i03= new Fields();
		i03.Ii=3;
		
		Fields i04= new Fields();
		i04.intSi=4;
		
		Fields i05= new Fields();
		i05.intSi=5;
		
		System.out.printf("new Fields() 수정후: Fields.i01:%d , Fields.i02:%d, Fields.i03:%d, intSI:%d, intSI:%d",i01.Ii,i02.Ii,i03.Ii,i04.intSi, i05.intSi);

	}

}
