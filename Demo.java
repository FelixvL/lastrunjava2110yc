class Demo{   // NP
	public static void main(String... ab){ 
		System.out.println("ei");
		Anders hetzelfde = new Anders();
		try{
			hetzelfde.hup();
		}catch(Throwable e){
			System.out.println("cc");
		}finally{
			System.out.println("ee");
		}
		System.out.println("einde");
	}
}

class Anders implements H{
	void hup(){
		throw new Error();
	}
	Object gaan(){
		H h = new Anders();
		return h;
	}
}

interface H{

}