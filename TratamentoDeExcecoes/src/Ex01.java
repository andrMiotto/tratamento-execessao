import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numero = 0;

		boolean entradaInvalida = true;

		while (entradaInvalida) {
			System.out.print("Digite um número inteiro: ");
			String texto = input.nextLine();

			try {
				numero = Integer.parseInt(texto);
				entradaInvalida = false;
			} catch (NumberFormatException erro) {
				System.out.println("Valor inválido! Tente novamente.");
			}
		}

		System.out.println("Número final: " + numero);
	}
}
