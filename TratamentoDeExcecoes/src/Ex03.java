
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;
		String nome = null;

		boolean entradaInvalida = true;

		while (entradaInvalida) {

			System.out.println("Digite o nome do produto");
			nome = input.nextLine();

			System.out.println("Digite o preço do produto");
			String preco = input.nextLine();

			try {
				numero = Integer.parseInt(preco);
				entradaInvalida = false;
			} catch (NumberFormatException erro) {
				System.out.println("Valor invalido");
			}

		}

		System.out.println("Produto cadastrado com sucesso!!");
		System.out.println("Nome: "+nome);
		System.out.println("Preços: "+numero);
		
		
	}

}
