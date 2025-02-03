import java.util.Scanner;

public class IBGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o produto para calcular o preço médio: ");
        String nomeProduto = scanner.next(); // Usa nextLine() se o nome do produto tiver espaços

        System.out.println("Após a pesquisa de preço nos 5 mercados próximos, informe o valor unitário do produto de cada mercado: ");
        float precoProduto1 = scanner.nextFloat();
        float precoProduto2 = scanner.nextFloat();
        float precoProduto3 = scanner.nextFloat();
        float precoProduto4 = scanner.nextFloat();
        float precoProduto5 = scanner.nextFloat();

        float calculoMedia = (precoProduto1 + precoProduto2 + precoProduto3 + precoProduto4 + precoProduto5) / 5;

        // Corrigindo a formatação para exibir duas casas decimais corretamente
        System.out.printf("O preço médio do produto %s é de: R$ %.2f%n", nomeProduto, calculoMedia);

        scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
    }
}
