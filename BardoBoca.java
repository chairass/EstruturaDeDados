import java.util.Scanner;

public class BardoBoca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o total da mesa: ");
        double total = scanner.nextFloat();

        double totalVenda = total + (total * 0.20) + 10;

        System.out.printf("O total da venda somando a taxa de serviço com o couvert é de R$ %.2f\n", totalVenda);

    }
}
