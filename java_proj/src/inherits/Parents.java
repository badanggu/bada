package inherits;

public class Parents {
   String name;
   int age;
   
   //생성자
   public Parents() {}  //기본생성자
   public Parents(String name, int age) {  //생성자 오버로딩
      this.name= name; this.age=age;
   }  
      
      
   
   //메소드
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
  
   //오버로딩. setHuman은 부모에 있어도 인수가 달라. 같은 클래스 안에 같은 이름의 메서드, 파라미터 타입이나 개수가 틀려.부모메서드를 오버로딩한거야. 
   public void setHuman(String name, int age) {  //생성자 오버로딩/parameter를 다르게함.
      this.name= name; this.age=age;}
    
   //재정의될 메소드(부모클래스에도 getHuman이 있어.) 똑같은걸 덮어쓰기(오버라이딩)
   public String  getHuman() {
      return String.format("%s(%s세, ",this.name, this.age);
}
}