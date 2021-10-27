class Demo{   // OD   
	final static public void main(String[] ab){ 
		System.out.println("ke");
		B a = new B();				
		a.gaan();				
		System.out.println("ko");
	}
}
class A implements C{				
	public B gaan(){			
		System.out.println("gaan in a");
		return new B();
	}
}

class B extends A{				
	public B gaan(){		
		System.out.println("gaan in b");
		return null;
	}
}
interface C{				
	int d = 5;
	B gaan() throws Exception;				
}