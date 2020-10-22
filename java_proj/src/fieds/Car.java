package fieds;
class Cara {
	 String company = "현대자동차";
	 String model;
	 String color;
	 int maxSpeed;
	 Cara(){};
	 Cara(String model){
		 this.model=model;}
	 Cara(String model, String color){
		 this.model=model;
		 this.color=color;}
	 Cara(String model,String color, int maxSpeed){
		 this.model=model;
		 this.color=color;
		 this.maxSpeed=maxSpeed;
	 }}
	
 
public class Car{	
 public static void main(String[] args) { 
	 		Cara car = new Cara();
Cara car1=new Cara();
System.out.println(car1.company);

Cara car2=new Cara("i30","red",60);
System.out.printf("%s,%s,%s",car2.model,car2.color,car2.maxSpeed);


}
 }
 

