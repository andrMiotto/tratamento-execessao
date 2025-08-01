import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero");
		String texto = input.nextLine();

		try {
			int numero = Integer.parseInt(texto);
			System.out.println("Voce digitou o numero: " + numero);
		} catch (NumberFormatException erro) {

			System.out.println("Erro: você não digitou um número válido.");

		}
		
        input.close();

	}
}
