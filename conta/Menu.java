package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("-----------------------------------------");
			System.out.println("                                         ");
			System.out.println("	BANCO DO BRAZOL COM Z	           	 ");
			System.out.println("                                         ");
			System.out.println("-----------------------------------------");
			System.out.println("    							         ");
			System.out.println("	 1-CRIAR CONTA				         ");
			System.out.println("	 2- LISTAR TODAS AS CONTAS           ");
			System.out.println("	 3- BUSCAR CONTA POR NUMERO          ");
			System.out.println("	 4- ATUALIZAR OS DADOS DA CONTA      ");
			System.out.println("	 5- APAGAR CONTA                     ");
			System.out.println("	 6- SACAR							 ");
			System.out.println("	 7- DEPOSITAR                        ");
			System.out.println("	 8- TRANSFERIR VALORES ENTRE CONTAS	 ");
			System.out.println("	 9- SAIR							 ");
			System.out.println("										 ");
			System.out.println("-----------------------------------------");
			System.out.println("ENTRE COM A OPÇÃO DESEJADA: 		     ");
			System.out.println("					   "+ Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_RESET + "\n Banco do Brazil com Z- O futuro começa aqui!");
				//sobre();
	leia.close();
				System.exit(0);
		

			switch (opcao) {
					case 1:
						System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");

						break;
					case 2:
						System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");

						break;
					case 3:
						System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");

						break;
					case 4:
						System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");

						break;
					case 5:
						System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");

						break;
					case 6:
						System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

						break;
					case 7:
						System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

						break;
					case 8:
						System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");

						break;
					default:
						System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção Inválida!\n");
						break;
				}
			}
		}
		//public static void sobre() {
			//System.out.println("\n*********************************************************");
		
			}
	}

