import java.util.Scanner;

public class CasaCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em reais");
        double real = scanner.nextDouble();

        System.out.println("Agora informe o valor de cada moeda");

        System.out.print("Dolar Americano: ");
        double americano = scanner.nextDouble();

        System.out.print("Peso Argentino: ");
        double argentino = scanner.nextDouble();

        System.out.print("Dolar Canadense: ");
        double canadense = scanner.nextDouble();

        System.out.print("Euro: ");
        double euro = scanner.nextDouble();

        double cotacaoEuropeia = real / euro;
        double cotacaoAmericana = real / americano;
        double cotacaoCanadense = real / canadense;
        double cotacaoArgentino = real / argentino;

        System.out.println("Com R$ " + real + " você tera em cada moeda");
        System.out.printf("%.2f Euros (EUR)\n", cotacaoEuropeia);
        System.out.printf("%.2f Americano (USD)\n", cotacaoAmericana);
        System.out.printf("%.2f Canadense (CAD)\n", cotacaoCanadense);
        System.out.printf("%.2f Argentino (ARS)\n", cotacaoArgentino);
    }
}