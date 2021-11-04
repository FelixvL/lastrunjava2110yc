class Demo{   //  XH
	final static public void main(String[] ab){
		Trial q = new Trial();//22 23
		System.out.println(q.abc());
		System.out.println(q.abc());
		System.out.println(q.abc());
		System.out.println(q.abc());
		System.out.println(q.b);
		System.out.println(q.a);
		
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
	 static int a = 23;
	 int b = abc();

}