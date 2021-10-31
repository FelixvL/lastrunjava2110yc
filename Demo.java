class Demo{   // PC
	final static public void main(String[] ab) { 
		System.out .println("start");
		AAA a = new AAA();
		AAA b = (QQQ)a;
		System.out.println("end");
	}
}

class AAA{ 

}

class QQQ extends AAA{ 

}

interface JJJ{		

}