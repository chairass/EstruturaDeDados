import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        float altura;
        float peso;
        float imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura:");
        altura = scanner.nextFloat();

        System.out.println("Informe seu peso:");
        peso = scanner.nextFloat();

        scanner.close(); // Fechar o scanner para evitar vazamento de recursos

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("O aluno está abaixo do peso. Formule para ele uma dieta rica em calorias e proteínas para ganho de massa.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("O aluno está com o peso ideal. Ajude-o a manter.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("O aluno está um pouco acima do peso. Faça uma dieta para perda de gorduras.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("O aluno está em obesidade grau 1.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("O aluno está em obesidade grau 2.");
        } else {
            System.out.println("O aluno está em obesidade grau 3.");
        }
    }
}
