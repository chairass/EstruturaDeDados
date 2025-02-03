import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        float comprimento;
        float largura;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento do terreno:");
        comprimento = scanner.nextFloat();

        System.out.println("Informe a largura do terreno:");
        largura = scanner.nextFloat();

        System.out.println("A area total do terreno é de: " + (comprimento * largura));

    }
}
