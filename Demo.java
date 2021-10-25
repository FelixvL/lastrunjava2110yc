class Demo{   // SH
	public static void main(String... ab) throws NoEggsException{
		Kip kap = new Kip();
		try{
			kap.herewego();
		}catch(Exception e){
			System.out.println("oei");
		}finally{
			System.out.println("ai");
		}	
		System.out.println("tik");
	}
}

class Kip{
	boolean boos;
	int herewego() throws NoEggsException{
		System.out.println("de kip is boos? " + boos);
		return 12;
	}

}

class NoEggsException extends Exception{}