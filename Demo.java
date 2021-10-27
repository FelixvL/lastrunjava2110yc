class Demo{   // NK
	public static void main(String... ab) throws Exception{
		System.out.println("ei");
		Anders hetzelfde = new Anders();
		hetzelfde.hup();
		System.out.println("einde");
	}
}

class Anders{
	void hup() throws Exception{
		throw new Exception();
	}
}