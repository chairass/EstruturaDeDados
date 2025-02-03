import java.util.Scanner;

public class SomaArea {
        public static void main(String[] args) {
            float ladoA, ladoB, ladoC, ladoD;
            float total;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe a medida de cada lado do terreno");
            ladoA = scanner.nextFloat();
            ladoB = scanner.nextFloat();
            ladoC = scanner.nextFloat();
            ladoD = scanner.nextFloat();

            total = ladoA + ladoB + ladoC + ladoD;

            System.out.printf("A área total do terreno é: %.2f metros\n", total);

            scanner.close();
        }
}
