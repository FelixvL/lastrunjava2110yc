class Demo{   // OB   
	final static public void main(String[] ab){ 
		System.out.println("ke");
		B a = new B();				
		a.gaan(3);				
		System.out.println("ko");
	}
}
class A implements C{				
	public void gaan(){			
		System.out.println("gaan in a");
	}
}

class B extends A{				
	public void gaan(){		
		System.out.println("gaan in b");
	}
}
interface C{				
	int d = 5;
	void gaan();				
}