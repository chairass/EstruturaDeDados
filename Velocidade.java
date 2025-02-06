import java.util.Scanner;

public class Velocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular a velocidade média de um veiculo informe a distância pecorrida, o tempo que" +
                " levou para pecorrer");

        System.out.print("Ditância em metros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Tempo gasto: ");
        double tempo = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;

        System.out.printf("A velocidade média foi de: %.2f %.3f" , velocidadeMedia, tempo);
    }
}
