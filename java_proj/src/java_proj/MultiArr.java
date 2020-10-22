package java_proj;

public class MultiArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] mems = new String[4][3];
		/*
		 * 이승엽(45),이예린(25),이만기(58)
		 		 * */
	mems[0][0] = "이승엽";mems[0][1] = "45"; mems[0][2] = "45";
	mems[1][0] = "이예린";mems[1][1] = "25"; mems[1][2] = "45";
	mems[2][0] = "이만기";mems[2][1] = "58"; mems[2][2] = "45";
	mems[3][0] = "이만기";mems[3][1] = "58"; mems[3][2] = "45";
	//출력 
	/*
	 * 이승엽(45),이예린(25),이만기(58)
	 		 * */
for (int i = 0; i < mems.length; i++) {
	if(i==mems.length-1) {
		System.out.printf("%s,%s,%s",mems[i][0],mems[i][1],mems[i][2]);
break;
	}
	System.out.printf("%s(%s)(%s)\n",mems[i][0],mems[i][1],mems[i][2]);
}
	
	
	}

}
