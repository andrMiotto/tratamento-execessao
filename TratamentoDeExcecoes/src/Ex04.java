import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        String nome = null;

        boolean continuar = true;

        while (continuar) {

            System.out.println("=-----MENU-----=");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Somar números");
            System.out.println("3 - Subtrair números");
            System.out.println("4 - Sair");
            System.out.print("> ");

            int opcao;
            try {
                opcao = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida, digite um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    nome = input.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    String preco = input.nextLine();

                    try {
                        numero1 = Integer.parseInt(preco);
                        System.out.println("Produto cadastrado: " + nome + " - R$ " + numero1);
                    } catch (NumberFormatException erro) {
                        System.out.println("Preço inválido.");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Digite o primeiro número: ");
                        numero1 = Integer.parseInt(input.nextLine());

                        System.out.print("Digite o segundo número: ");
                        numero2 = Integer.parseInt(input.nextLine());

                        int soma = numero1 + numero2;
                        System.out.println("Resultado da soma: " + soma);
                    } catch (NumberFormatException erro) {
                        System.out.println("Entrada inválida, tente novamente.");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Digite o primeiro número: ");
                        numero1 = Integer.parseInt(input.nextLine());

                        System.out.print("Digite o segundo número: ");
                        numero2 = Integer.parseInt(input.nextLine());

                        int subtracao = numero1 - numero2;
                        System.out.println("Resultado da subtração: " + subtracao);
                    } catch (NumberFormatException erro) {
                        System.out.println("Entrada inválida, tente novamente.");
                    }
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        input.close();
    }
}
