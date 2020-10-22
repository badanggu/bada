package classis;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//HashMap<Key-데이터조회용키(어레이에선 인덱스), String-데이터타입> hashMapnew HashMap<Key,String>--String은 equals를 갖고 있어서- 조회할때 좋아. hashcode는 객체가 있는 메모리주소(고유함)
		//해쉬코드가 달라도,키가 같으면 조회되는데, 이걸 조회하려면 이퀄스를 쓸수 있는 String으로 ..?String이 갖고 있는게 글자값을 조회하는것도 있지만, 해쉬코드도 조회해!
		//해쉬멥의 선언
		HashMap<Key,String> hashMap= new HashMap<Key,String>();
		
		//식별키--해쉬맵이란건 키가 스트링으로 써서, 스트링은 해쉬코드까지 판별할수 있게 되어있어! 여기 new key는 해쉬코드 없어 우리가 만든거니까- 그래서
		//Hashmap에 데이터를 연결(할당)
		//new Key(1)- 식별키
		hashMap.put(new Key(1), "홍길동");
		String value= hashMap.get(new Key(1));
		System.out.println(value);
		
		Key k2=new Key(1);
		hashMap.put(k2, "손흥민");
		String value2= hashMap.get(k2);
	System.out.println(value2);

	}
	
	//리턴이 null이 나온건 - 해쉬맵의 키로 사용되지 않았으면 (1)로 같은 값이라고 나왔을텐데, 해쉬코드를 붙여서 - 틀린 주소니까 null이라고 나옴.

}
