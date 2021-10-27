class Demo{   // OC   
	final static public void main(String[] ab){ 
		System.out.println("ke");
		B a = new B();				
		a.gaan();				
		System.out.println("ko");
	}
}
class A implements C{				
	public void gaan(){			
		System.out.println("gaan in a");
	}
}

class B extends A{				
	public int gaan(){		
		System.out.println("gaan in b");
		return 7;
	}
}
interface C{				
	int d = 5;
	void gaan();				
}