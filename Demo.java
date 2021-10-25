class Demo{   // SF
	public static void main(String... ab) throws NoEggsException{
		Kip kap = new Kip();
		try{
			kap.herewego();
		}catch(Exception e){
			System.out.println("oei");
		}	
		System.out.println("tik");
	}
}

class Kip{
	boolean boos;
	int herewego() throws NoEggsException{
		System.out.println("de kip is boos? " + boos);
		throw new NoEggsException();
		return 9;
	}

}

class NoEggsException extends Exception{}