class Demo{  // ZJ
	public static void main(String[] args){
		System.out.println("go");
		int a = 3;
		HHH fff = new HHH();
		fff.fff(a);
		System.out.println(fff.a);
		System.out.println("e");
	}
}

class GGG{
	int a = 6;
	void fff(int a){
		System.out.println("vlakbij");
		System.out.println(a);
		fff();
	}
	void fff(){
		System.out.println("ooit");
		System.out.println(a);	
	}
}
class HHH extends GGG{
	int a = 2;
	void fff(){
		System.out.println("hier");
		System.out.println(a);
	}

}