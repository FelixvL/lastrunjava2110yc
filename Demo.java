class Demo{   // PL
	final static public void main(String[] ab) { 
		System.out .println("start");
		AAA a = new QQQ();
		JJJ b = (QQQ)a;
		b.aaa();
	}
}

class AAA implements JJJ{ 
	public void aaa(){
		System.out.println("in aaa");
		throw new RuntimeException();
	}
}

class QQQ extends AAA{ 
	public void aaa(){
		System.out.println("in qqq");
	}
}
class RRR{
 
}
interface JJJ{		
	void aaa() throws Exception;
}

// zelfde sig
// covariant returnt
// access niet nauwer
// throws covariant of niets