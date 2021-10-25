class Demo{   // SG
	public static void main(String... ab) throws NoEggsException{
		Kip kap = new Kip();
		try{
			int a = 6;
			kap.herewego();
		}catch(Exception e){
			a = 7;
			System.out.println("oei");
		}	
		System.out.println("tik" + a);
	}
}

class Kip{
	boolean boos;
	int herewego() throws NoEggsException{
		System.out.println("de kip is boos? " + boos);
		throw new NoEggsException();
	}

}

class NoEggsException extends Exception{}