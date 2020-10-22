package fieds;


 class FieldIn{
	byte byteField;
	short shortField;
	int intField;
	long longField;
	boolean booleanField;
	float floatField;
	double doubleField;
	int[] arrField;
	String referenceField;}
 
	public class FieldInitValue{
	public static void main(String[] args) {
	FieldIn fiv= new FieldIn();
	fiv.referenceField="안녕";

int[] factorial = { 1, 1, 2, 6, 24, 120, 720, 5040 };
System.out.println("byteField:"+fiv.byteField);
System.out.println("shortField:"+fiv.shortField);
System.out.println("arrField:"+fiv.arrField);
System.out.println("referenceField:"+fiv.referenceField);
System.out.println("int:"+factorial);

	}

}
