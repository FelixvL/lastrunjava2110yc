class Demo{   // SC
	public static void main(String... ab){
		Kip kap = new Kip();
		kap.herewego();
		System.out.println("tik");
	}
}

class Kip{
	boolean boos;
	int herewego() throws NoEggsException{
		System.out.println("de kip is boos? " + boos);
		return 9;
	}

}

class NoEggsException extends Exception{}