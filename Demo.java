class Demo{   // SO
	public static void main(String... ab){
		Q q = new E();
		L l = new E();
		q.i();
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