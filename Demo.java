class Demo{   //  XD
	final static public void main(String[] ab){
		Trial q = new Trial();
		Trial w = q;
		q.a++;
		System.out.println(w.b);
		new Trial();
		System.out.println("Einde");
	}
}
class Trial{
	static b = abc();
	int a = 22;
	static int abc(){
		System.out.println("ff checken");
		return a++;
	}
}