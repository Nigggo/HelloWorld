public class HelloWorld {
	
	//static int number = 2
	static int counter = 2;
	static boolean isPrime = true;
	
	public static void main(String[] args) {
		
		for(int number=2; number<1000; number++) {
			while(counter<=number/2 && isPrime==true) {
				if(counter%counter==0) {isPrime=false;};
		
				counter++;			
		}
			counter=2;
			if(isPrime==true) {System.out.println(number);}
			else{isPrime=true;}
		} 	
	}
}