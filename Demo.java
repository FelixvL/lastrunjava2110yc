class Demo{   // OL
	final static public void main(String[] ab) { 
		HereWeGo go = new Rechthoek();
		go.hup();
		go.gaan();
		Rond r = (Rond)go;
		r.gaan();
	}
}



abstract class HereWeGo{
	abstract void gaan();
	static void hup(){
		System.out.println("hup");
	}
}
abstract class Rond extends HereWeGo{
	void gaan(){
		System.out.println("we zijn aan het gaan");
	}
}
abstract class Vierkant extends Rond{
	abstract void gaan();
}
class Rechthoek extends Vierkant{
	void gaan(){
		System.out.println("gaan bij rechthoek");
	}
	static void hup(){
		System.out.println("huphup");
	}
}