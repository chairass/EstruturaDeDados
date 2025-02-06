import java.util.Scanner;

public class CasaTinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho em metros quadrados da área que deseja pintar: ");
        double metroQuadrado = scanner.nextDouble();

        // Cálculo da quantidade de tinta necessária em litros (sem folga)
        double litrosTinta = metroQuadrado / 6;

        // Opção A: Apenas latas de 18 litros
        int latasA = (int) Math.ceil(litrosTinta / 18);
        double precoA = latasA * 80;

        // Opção B: Apenas galões de 3.6 litros
        int galoesB = (int) Math.ceil(litrosTinta / 3.6);
        double precoB = galoesB * 25;

        // Opção C: Misturar latas e galões para minimizar desperdício (com 10% de folga)
        double litrosTintaComFolga = litrosTinta * 1.1;
        int latasC = (int) (litrosTintaComFolga / 18);
        double restante = litrosTintaComFolga % 18;
        int galoesC = (int) Math.ceil(restante / 3.6);
        double precoC = (latasC * 80) + (galoesC * 25);

        // Exibir resultados
        System.out.printf("Para pintar %.2f m², você pode escolher entre as seguintes opções:%n", metroQuadrado);
        System.out.printf("1. Apenas latas de 18L: %d latas - Custo total: R$ %.2f%n", latasA, precoA);
        System.out.printf("2. Apenas galões de 3.6L: %d galões - Custo total: R$ %.2f%n", galoesB, precoB);
        System.out.printf("3. Misturar latas e galões: %d latas e %d galões - Custo total: R$ %.2f%n", latasC, galoesC, precoC);

        scanner.close();
    }
}
