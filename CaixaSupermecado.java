import java.util.Scanner;

public class CaixaSupermecado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto:");
        float valorProduto = scanner.nextFloat();

        System.out.println("Quantidade:");
        int qtdProduto = scanner.nextInt();

        System.out.println("O total da compra foi: 2f%" + valorProduto * (float)qtdProduto);
    }
}
