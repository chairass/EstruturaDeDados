import java.util.Scanner;

public class DividirConta {
    public static void main(String[] args) {
        int qtdPessoas;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantas pessoas consumiram:");
        qtdPessoas = scanner.nextInt();

        System.out.println("Informe o valor total da mesa:");
        float valorTotal = scanner.nextFloat();

        float valorPessoa = valorTotal / (qtdPessoas - 1);

        System.out.printf("O valor por pessoa é de R$ %.2f \n", valorPessoa);

        scanner.close();
    }
}
