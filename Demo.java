
signature MOET hetzelfde zijn
returntype MOET covariant zijn
accesmodifier MAG NIET vernauwen
(checked exception) De throws clausule MAG ALLEEN een covariant throwsen of NIETS


class Demo{  // ZR
	public static void main(String[] args){
		System.out.println("go");
		HHH fff = new HHH();
		fff.b("ai").fff();
		System.out.println(fff.b);
		System.out.println("e");
	}
}

class GGG{
	String b;
	GGG b(String b){
		this.b = b;
		System.out.println("in ggg");
		return new GGG();
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
	HHH b(String a){
		System.out.println("oeps");
		return new HHH();
	}
	void fff(){
		System.out.println("hier");
		System.out.println(a);
	}

}