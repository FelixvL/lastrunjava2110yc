class Demo{   //  WW
	final static public void main(String[] ab){
		Fiets fiets = new Fiets();
		try{
			fiets.fietsen();
		}catch(BelKapotE be){
			System.out.println("bel erg kapot");
		}catch(Exception e){
			System.out.println("bel kapot");
		}finally{
			System.out.println("a");
		}
		System.out.println("b");
	}
}

class Fiets{
	Bel bel = new Bel();
	void fietsen() throws BelKapotE{
		bel.bellen();
		System.out.println("ik fiets");
	}

}

class Bel{
	void bellen()throws BelKapotE{
		System.out.println("ik ben aan het bellen");
		throw new BelKapotE();
	}
} 

class BelKapotE extends Exception{}