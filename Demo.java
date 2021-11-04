class Demo{   //  XG
	final static public void main(String[] ab){
		Trial q = new Trial();//22 23
		Trial w = q;
		q.a++; //24
		Trial z = new Trial();//24 25
		Trial zz = new Trial(); //25 26
		System.out.println(w.b);
		System.out.println(w.a);
		System.out.println("Einde");
		System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(zz.a);
		System.out.println(zz.b);
	}
}
class Trial{
	Trial(){
		System.out.println("hoi");
	}
	 int abc(){
		System.out.println("ff checken");
		return ++a;
	}
	 static int a = 22;
	 int b = abc();

}