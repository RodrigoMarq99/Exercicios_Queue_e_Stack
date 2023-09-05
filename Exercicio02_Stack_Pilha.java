package ExerciciosQueueEStack;

import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

public class Exercicio02_Stack_Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();
		String opcao;

		do {
			// Menu
			System.out.println("*****************************************************");
			System.out.println("\n" + "	1-Adicionar livro na pilha");
			System.out.println("	2-Listar todos os livros");
			System.out.println("	3-Retirar Livro da pilha");
			System.out.println("	0-Sair");
			System.out.println("\n" + "*****************************************************");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextLine();
			Iterator<String> ilivros = livros.iterator();

			switch (opcao) {
			case "1":
				System.out.println("Digite o nome: ");
				String nome = leia.nextLine();
				livros.push(nome);
				break;
			case "2":
				if (livros.isEmpty() == false) {
					while (ilivros.hasNext()) {
						System.out.println(ilivros.next());
					}
				} else {
					System.out.println("A Pilha está vazia!");
				}
				break;
			case "3":
				if (livros.isEmpty() == false) {
					System.out.println("O livro " + livros.pop() + " foi retirado da pilha!");
					ilivros = livros.iterator();
					while (ilivros.hasNext()) {
						System.out.println(ilivros.next());
					}
				} else {
					System.out.println("A Pilha está vazia!");
				}
				break;
			case "0":
				System.out.println("Programa Finalizado!");
				break;
			}
		} while (!opcao.equals("0"));
		leia.close();
	}
}