
import java.util.Scanner;

public class reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Valor atual do curso: ");
        double valorCurso = scanner.nextDouble();

        double valorNovoCurso = valorCurso * 1.075;
        scanner.close();
        System.out.printf("O curso %s passará a custar R$ %.2f%n", nomeCurso, valorNovoCurso);

    }
    
}