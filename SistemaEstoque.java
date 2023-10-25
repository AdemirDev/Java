package Aula10;

import java.util.Scanner;

import aula04.SwithCase;

public class SistemaEstoque {

	public static void main(String[] args) {
		
		int tamanhoEstoque = 5;
		
		Scanner opcao = new Scanner(System.in);
		
		System.out.println("Sistema de Controle de Estoque: \n");
		System.out.println("Escolha uma Opcao: \n");
		System.out.println("Opcao 1:\n Incluir Produto\n");
		System.out.println("Opcao 2:\n Atualizar Produto\n");
		System.out.println("Opcao 3:\n Excluir Produto\n");
		System.out.println("Opcao 4:\n Sair do Programa\n");
		
		int escolha = opcao.nextInt();
		
		switch (escolha) {
		
		case 1:
			
			Scanner sc = new Scanner(System.in);
			String [] produto =new String[tamanhoEstoque];
			for ( int i=0;i< produto.length; i++) {
				System.out.print("Digite o Produto: " );
				produto[i]= sc.nextLine();
			}
			
			Double[] preçoProduto = new Double[tamanhoEstoque];
			for ( int i=0; i < preçoProduto.length; i++);
			System.out.print("Digite o Valor do Produto: ");
	//		preçoProduto[i]= sc.nextDouble();
		}



	}

}
