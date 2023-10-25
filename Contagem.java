package ExercicioPagina100;

public class Contagem {
	
	public static void contar() {
		
		int i= 0;		
		for (i=1; i<=10; i++) {
		System.out.println("Contagem: " + i);
		}
		
	}
		
		
		public static void contar(int x, int y) {		
					
			int i= 0;		
			for (i= x; i<=y; i++) {
			System.out.println("Contagem: " + i);
			
			}
		
	}
	
	

	public static void main(String[] args) {
		 
	int x = 0;
	int y = 0;
	
	contar(x,y);
		

	}

}
