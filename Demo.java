class Demo{   // SJ
	public static void main(String... ab){
		Kip kap = new Kip();
		try{
			kap.herewego();
		}catch(NoEggsException e){
			System.out.println("oei");
		}finally{
			System.out.println("ai");
		}	
		System.out.println("tek");
	}
}

class Kip{
	boolean boos;
	int herewego() throws Exception{
		System.out.println("de kip is boos? " + boos);
		throw new NoEggsException();
	}

}

class NoEggsException extends Exception{}