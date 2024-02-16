package stackQueue;

import java.util.*;

public class fila {

	public static void main(String[] args) {
		/* Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos
		 * da Classe String, para organizar a ordem de chegada dos Clientes de um Banco.
		 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		●	1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		●	2: Listar todos os Clientes na fila
		●	3: Chamar (retirar) uma pessoa da fila 
		●	0: O programa deve ser finalizado. 
		 * Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila. 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		Queue<String> filaClientes = new LinkedList <>();	
		
		
		do {
			System.out.println("***Menu - Escolha uma opção***");
			System.out.println("1 - Adicionar um novo Cliente na fila.");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				scanner.nextLine();
				System.out.println("\nDigite o nome do Cliente: ");
				String nomeCliente = scanner.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("Cliente adicionado à fila. ");
				break;
			case 2:
				if(filaClientes.isEmpty()) {
					System.out.println("A fila está vazia");
				}else {
					System.out.println("Clientes na fila: ");
					for(String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;
			 case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				}else {
					String clienteChamado = filaClientes.poll();
					System.out.println(clienteChamado + " - Chamado(a) e removido da fila"); 
				}
			 	break;
			 	case 0:
			 		System.out.println("Programa finalizado.");
			 		break;
			 	default:
			 		System.out.println("Opção inválida. Tente novamente.");
			}
		}while(opcao != 0);
		
		scanner.close();
	}

}
