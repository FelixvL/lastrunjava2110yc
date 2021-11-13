class Demo{  // ZN
	public static void main(String[] args){
		System.out.println("go");
		HHH fff = new HHH();
		GGG ggg = new HHH();
		GGG hhh = new GGG();
		System.out.println(hhh.b);
		System.out.println("e");
	}
}

class GGG{
	String b;
	void b(String b){
		b = b;
		System.out.println("in ggg");
	}
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
	HHH(){
		System.out.println("in hhh");
	}
	void fff(){
		System.out.println("hier");
		System.out.println(a);
	}

}