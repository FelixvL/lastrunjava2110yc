class Demo{   // PI
	final static public void main(String[] ab) { 
		System.out .println("start");
		AAA a = new QQQ();
		AAA b = (QQQ)a;
		System.out.println("final");
	}
}

class AAA implements JJJ{ 
	public void aaa(){
		System.out.println("in aaa");
		throw new RuntimeException();
	}
}

class QQQ extends AAA{ 
	void aaa(){
		System.out.println("in qqq");
	}
}
class RRR{
 
}
interface JJJ{		
	void aaa() throws Exception;
}