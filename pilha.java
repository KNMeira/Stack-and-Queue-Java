package stackQueue;

import java.util.*;

public class pilha {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		Stack<String> pilhaLivros = new Stack<>();
		
		do {
			System.out.println("***Menu - Escolha uma opção***");
            System.out.println("1 - Adicionar um livro na pilha.");
            System.out.println("2 - Listar todos os livros da pilha.");
            System.out.println("3 - Retirar um livro da pilha.");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch(opcao) {
            case 1:
            	scanner.nextLine();
            	System.out.println("Digite o nome do livro: ");
            	String nomeLivro = scanner.nextLine();
            	pilhaLivros.push(nomeLivro);
            	System.out.println("Livro adicionado à pilha. ");
            	break;
            case 2:
            	if(pilhaLivros.isEmpty()) {
            		System.out.println("A pilha está vazia. ");
            	}else {
            		System.out.println("Livros na pilha");
            		for(String livro : pilhaLivros) {
            			System.out.println(livro);
            		}
            	}
            	break;
            case 3:
            	if(pilhaLivros.isEmpty()) {
            		System.out.println("A pilha está vazia.");
            	}else {
            		String livroRetirado = pilhaLivros.pop();
            		System.out.println("O livro " + livroRetirado + " foi retirado da pilha ");
            	}
            	break;
            case 0:
            	System.out.println("Programa finalizado!");
            	break;
            default:
            	System.out.println("Opção inválida. Tente novamente");
            }
			
		} while(opcao != 0);
		
		scanner.close();
	}

}
