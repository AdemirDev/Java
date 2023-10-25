package Aula10;

public class ArrayBidimencinal {

	public static void main(String[] args) {
		
		//int [][] matriz = new int [2][2];
		
		int [][] primeiroBd = { {0,1}, {2,3}};
		
		for (int linha =0; linha < primeiroBd.length; linha++) {
			for ( int coluna=0; coluna < primeiroBd[linha].length; coluna ++)
				
				System.out.println(primeiroBd[linha][coluna]);
		}
		
		

	}

}
