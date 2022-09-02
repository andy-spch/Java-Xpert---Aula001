import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String nome;  // Criamos uma variável
		System.out.print("Por favor, insira seu nome: ");
		nome = leitor.next();  // A variável será atribuída nome do Scanner
		System.out.println("O nome digitado foi " + nome);
		leitor.close();
	}

}
