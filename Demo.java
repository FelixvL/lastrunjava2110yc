class Demo{   //  WT
	final static public void main(String[] ab){
		Fiets fiets = new Fiets();
		try{
			fiets.fietsen();
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
	void fietsen() throws Exception{
		bel.bellen();
		System.out.println("ik fiets");
	}

}

class Bel{
	void bellen() throws Exception{
		System.out.println("ik ben aan het bellen");
		throw new Exception();
	}
} 