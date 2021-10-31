class Demo{   // QD
	final static public void main(String[] ab){ 
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
			return;
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