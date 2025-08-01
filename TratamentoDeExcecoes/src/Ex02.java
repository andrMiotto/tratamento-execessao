import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		boolean entradaInvalida = true;

		while (entradaInvalida) {
			try {
				System.out.print("Digite o primeiro número: ");
				numero1 = Integer.parseInt(input.nextLine());

				System.out.print("Digite o segundo número: ");
				numero2 = Integer.parseInt(input.nextLine());

				entradaInvalida = false;
			} catch (NumberFormatException erro) {
				System.out.println("Entrada inválida, tente novamente.");
			}
		}

		System.out.println("Soma dos dois números: " + (numero1 + numero2));
		input.close();
	}
}
