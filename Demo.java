class Demo{   // OJ
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
class Rond extends HereWeGo{

}
abstract class Vierkant extends Rond{

}
class Rechthoek extends Vierkant{
	static void hup(){
		System.out.println("huphup");
	}
}