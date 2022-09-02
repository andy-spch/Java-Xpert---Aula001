import java.util.Scanner;

public class Exercicio_Ong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa para o cálculo do véiculo da Ong");
		Scanner leitor = new Scanner(System.in);
		double consumo, km_inicio, km_posto, litros_abastecimento;
		System.out.print("Informe a Kilometragem do Painel: ");
		km_inicio = leitor.nextDouble();
		System.out.print("Informe a Kilometragem do painel na chegada ao"
				+ "posto: ");
		km_posto = leitor.nextDouble();
		System.out.print("Informe quantos litros foram abastecidos: ");
		litros_abastecimento = leitor.nextDouble();
		consumo = (km_posto - km_inicio) / litros_abastecimento;
		System.out.println("O consumo final foi de " + consumo +
				"km/l");
		leitor.close();
	}

}
