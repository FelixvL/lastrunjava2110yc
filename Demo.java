class Demo{   // NW   
	final static public void main(String[] ab){ 
		System.out.println("he");
		C a = new B();
		a.gaan();
		System.out.println("ho");
	}
}
class A implements C{
	void gaan(){
		System.out.println("gaan in a");
	}
}

class B extends A{

}
interface C{
	void gaan();
}