class Demo{   // NM
	public static void main(String... ab){ 
		System.out.println("ei");
		Anders hetzelfde = new Anders();
		try{
			hetzelfde.hup();
		}catch(Exception e){
			System.out.println("cc");
		}
		System.out.println("einde");
	}
}

class Anders{
	void hup() throws Exception{
		throw new Error();
	}
}