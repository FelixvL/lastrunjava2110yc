class Demo{   // NX   
	final static public void main(String[] ab){ 
		System.out.println("he");
		C a = new B();
		a.gaan();
		System.out.println("ho");
	}
}
class A implements C{
	public void gaan(){
		System.out.println("gaan in a");
	}
}

class B extends A{

}
interface C{
	int d;
	void gaan();
}