import java.util.Scanner;

public class Diagnostico {

    public static void main(String[] args) {
        Avaliacao avaliacaoDoUsuario = new Avaliacao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu peso?");
        String pesoEntrada = scanner.next();

        System.out.println("Qual a sua altura?");
        String alturaEntrada = scanner.next();

        double peso = Double.parseDouble(pesoEntrada);
        double altura = Double.parseDouble(alturaEntrada);

        avaliacaoDoUsuario.calcularIMC(peso, altura);

        scanner.close();
    }
}
