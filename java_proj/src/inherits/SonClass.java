package inherits;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class SonClass extends Parents {

   Boolean isArmy;
   
   //자식클래스의 생성자
   public SonClass() {}
   public SonClass(String name, int age, Boolean isArmy) {
      super(name, age); this.isArmy= isArmy;
      
   }

   public Boolean getIsArmy() {
      return isArmy;
   }

   public void setIsArmy(Boolean isArmy) {
      this.isArmy = isArmy;
   }
   
   public void setHuman(String name, int age, Boolean isArmy) {  
      setHuman(name, age); setIsArmy(isArmy);}
      
   public String getHuman() {  
      return super.getHuman() + (this.getIsArmy() !=null ? "군필" : "군미필" )+")";
   }
}
