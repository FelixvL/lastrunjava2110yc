class Demo{   // NE
	public static void main(String... ab){
		System.out.println("gaan");
		new Demo().beginnen();
	}
	void beginnen(){
		Go no = new Go();
		Go so = new Go();
		no.a = 18;
		no.hoi();
		System.out.println(so.a);
	}
}

class Go{
	static int a = 3;
	void hoi(){
		int a = 7;
		System.out.println(a);
		this.a = a;
	}
}