package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("                               ");
			System.out.println("	BANCO DO BRAZOL COM Z "     );
			System.out.println("                               ");
			System.out.println("-------------------------------");
			System.out.println("    							");
			System.out.println(		"1-CRIAR CONTA");
			System.out.println(		"2- LISTAR TODAS AS CONTAS");
			System.out.println(		"3- BUSCAR CONTA POR NUMERO");
			System.out.println(		"4- ATUALIZAR OS DADOS DA CONTA");
			System.out.println(		"5- APAGAR CONTA");
			System.out.println(		"6- SACAR");
			System.out.println(		"7- DEPOSITAR ");
			System.out.println(		"8- TRANSFERIR VALORES ENTRE CONTAS");
			System.out.println(		"9- SAIR");
			System.out.println("									");
			System.out.println("------------------------------------");
			System.out.println("ENTRE COM A OPÇÃO DESEJADA: 		");
			System.out.println("									");
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println("\n Banco do Brazil com Z- O futuro começa aqui!");
				//sobre();
	leia.close();
				System.exit(0);
		

			switch (opcao) {
					case 1:
						System.out.println("Criar Conta\n\n");

						break;
					case 2:
						System.out.println("Listar todas as Contas\n\n");

						break;
					case 3:
						System.out.println("Consultar dados da Conta - por número\n\n");

						break;
					case 4:
						System.out.println("Atualizar dados da Conta\n\n");

						break;
					case 5:
						System.out.println("Apagar a Conta\n\n");

						break;
					case 6:
						System.out.println("Saque\n\n");

						break;
					case 7:
						System.out.println("Depósito\n\n");

						break;
					case 8:
						System.out.println("Transferência entre Contas\n\n");

						break;
					default:
						System.out.println("\nOpção Inválida!\n");
						break;
				}
			}
		}
		//public static void sobre() {
			//System.out.println("\n*********************************************************");
		
			}
	}

