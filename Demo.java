class Demo{   // OP
	final static public void main(String[] ab) { 
		HereWeGo go = new Rechthoek();
		go.hup();
		go.gaan();
		System.out.println(go.a);
		Vierkant r = (Vierkant)go;
		r.gaan();
		System.out.println(r.a);
		Rechthoek rr = (Rechthoek)r;
		rr.hup();
	}
}



abstract class HereWeGo{
	int a = 3;
	abstract void gaan();
	static void hup(){
		System.out.println("hup");
	}
}
abstract class Rond extends HereWeGo{
	int a = 4;
	void gaan(){
		System.out.println("we zijn aan het gaan");
	}
}
abstract class Vierkant extends Rond{
	int a = 5;
	abstract void gaan();
}
class Rechthoek extends Vierkant{
	int a = 6;
	void gaan(){
		System.out.println("gaan bij rechthoek");
	}
	static void hup(){
		System.out.println("huphup");
	}
}