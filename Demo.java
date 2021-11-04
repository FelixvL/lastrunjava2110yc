class Demo{   //  XC
	final static public void main(String[] ab){
		int a = 34;
		char b = (char)a;
		b++;
		System.out.println(a);
		Trial q = new Trial();
		Trial w = q;
		q.a++;
		System.out.println(w.b);
		System.out.println("Einde");
	}
}
class Trial{
	static b = abc();
	int a = 22;
	int abc(){
		System.out.println("ff checken");
		return a++;
	}
}