class Demo{   // OK
	final static public void main(String[] ab) { 
		HereWeGo go = new Rechthoek();
		go.hup();
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

}
class Rechthoek extends Vierkant{
	static void hup(){
		System.out.println("huphup");
	}
}