class Demo{   //  XE
	final static public void main(String[] ab){
		Trial q = new Trial();
		Trial w = q;
		q.a++;
		System.out.println(w.b);
		System.out.println(w.a);
		new Trial();
		System.out.println("Einde");
	}
}
class Trial{
	static int b = abc();
	static int a = 22;
	static int abc(){
		System.out.println("ff checken");
		return a++;
	}
}