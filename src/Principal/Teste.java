package Principal;

public class Teste {

	public static void main(String[] args){
	
		System.out.println("Olá, GitHub!");
		
		System.out.println();
		for (int i=0; i<10; i++) {			
			
			System.out.print("_");
			delay();
			System.out.print("\\");
			delay();
			System.out.print("|");
			delay();
			System.out.print("/");	
			delay();
						
		}
	}

	private static void delay() {
		int w=5;
		for (int j=0; j<300000000; j++) {
			for (int k=0; k<300000000; k++) {
				w=-w;				
			}
			
		}
		
	}

}
