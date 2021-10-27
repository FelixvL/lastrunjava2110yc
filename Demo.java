class Demo{   // NC
	public static void main(String... ab){
		System.out.println("begin");
		new Demo().beginnen();
	}
	void beginnen(){
		Go no = new Go();
		Go so = new Go();
		no.a = 18;
		System.out.println(so.a);
		no.hoi();
	}
}

class Go{
	static int a = 3;
	void hoi(){
		int a = 7;
		System.out.println(a);
		a = a;
	}
}