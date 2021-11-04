class Demo{   //  XG
	final static public void main(String[] ab){
		Trial q = new Trial();
		Trial w = q;
		q.a++;
		new Trial();
		new Trial();
		System.out.println(w.b);
		System.out.println(w.a);
		System.out.println("Einde");
	}
}
class Trial{
	Trial(){
		System.out.println("hoi");
	}
	 int abc(){
		System.out.println("ff checken");
		return a++;
	}
	 static int a = 22;
	 int b = abc();

}