package mypractice;

public class SingerMain {

	public static void main(String[] args) {
		OurSinger sin=new OurSinger(new Singer());
		OurSinger dan=new OurSinger(new Dancer());
		System.out.println("가창력가수");
		sin.iss.Song();
		sin.iss.Song();
		System.out.println("================"
				+ "");
		System.out.println("댄스가수");
		dan.iss.Dance();
		dan.iss.Dance();

	}

}
