import java.util.Scanner;

public class Exercicio_Ong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Conversor de Reais em Dolar.");
		Scanner leitor = new Scanner(System.in);
		double vdolar, resultado, cotacao_dolar;
		System.out.print("Informe o valor total em dolar: $");
		vdolar = leitor.nextDouble();
		System.out.println("Informe a cotacao do dolar hoje: $");
		cotacao_dolar = leitor.nextDouble();
		resultado = vdolar * cotacao_dolar;
		System.out.println("O valor final da cotação é R$" + resultado);
		leitor.close();
	}

}
