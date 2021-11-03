class Demo{   // QD
	final static public void main(String[] ab){
		System.out.println("hoi"); 
		new WWW().worldwidewebben();
		System.out.println("ffew");
	}
}

class WWW{

	void worldwidewebben(){
		try{
			new TTT().proberen();
		}catch(Exception e){
			System.out.println("gevangen!");
		}finally{
			System.out.println("in finally");
		}
		System.out.println("ik leef nog");
	}


}
class TTT{
	void proberen(){
		throw new HereWeGoException();
	}

}

class HereWeGoException extends Error{}

//  100 = d