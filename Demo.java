class Demo{   //  WR
	final static public void main(String[] ab){
		Fiets fiets = new Fiets();
		fiets.fietsen();
	}
}

class Fiets{
	Bel bel = new Bel();
	void fietsen(){
		bel.bellen();
		System.out.println("ik fiets");
	}

}

class Bel{
	void bellen(){
		System.out.println("ik ben aan het bellen");
		throw new RuntimeException();
	}
} 