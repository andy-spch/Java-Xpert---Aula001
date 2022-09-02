import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		int soma, subtracao, multiplicacao;
		double divisao;
		System.out.println("Calculadora - Faremos a soma, subtração, "
				+ "multiplicação e divisão nesse programa");
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		numero1 = leitor.nextInt();
		System.out.print("Informe o segundo número: ");
		numero2 = leitor.nextInt();
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		System.out.println("Soma = " + soma + 
				"\nSubtração = " + subtracao +
				"\nMultiplicação = " + multiplicacao +
				"\nDivisão = " + divisao);
		leitor.close();
	}

}
