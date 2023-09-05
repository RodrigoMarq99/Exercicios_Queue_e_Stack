package ExerciciosQueueEStack;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Exercicio01_Queue_Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Queue<String> clientes = new LinkedList<String>();
		String opcao;
		
		do {
		// Menu
		System.out.println("*****************************************************");
		System.out.println("\n" + "	1-Adicionar Cliente na Fila");
		System.out.println("	2-Listar todos os Clientes");
		System.out.println("	3-Retirar Cliente da Fila");
		System.out.println("	0-Sair");
		System.out.println("\n" + "*****************************************************");
		System.out.println("Entre com a opção desejada:");
		opcao = leia.nextLine();
		Iterator<String> iclientes = clientes.iterator();
	
		switch(opcao) {
		case "1": System.out.println("Digite o nome do cliente: ");
		String nome = leia.nextLine();
		clientes.add(nome);
		break;
		case "2": 
			if(clientes.isEmpty() == false) {
			while(iclientes.hasNext()) {
			System.out.println(iclientes.next());
		}
			}else {
				System.out.println("A Fila está vazia!");
			}
		break;
		case "3":
			if(clientes.isEmpty() == false) {
				System.out.println("O Cliente " + clientes.poll() + " foi chamado!");
				iclientes = clientes.iterator();
				while(iclientes.hasNext()) {
				System.out.println(iclientes.next());
			}
			}else{
				System.out.println("A Fila está vazia!");
			}
	    break;
		case "0": System.out.println("Programa Finalizado!");
		break;
		}
		} while(!opcao.equals("0"));
		
		leia.close();
	}
}