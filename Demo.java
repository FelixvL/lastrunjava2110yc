class Demo{   // SP
	public static void main(String... ab){
		Q q = new E();    // links bepaalt waar je bij kan 
					// rechts bepaalt wat je uiteindelijk kan en doet
		E l = new E();
		l.i();
		System.out.println("ready");
	}
}

abstract class Q{   
		
	
}

class E extends Q implements L{               
	void i(){
		System.out.println("in E de i");
	}
}

interface L{    					   
	void i();			
}