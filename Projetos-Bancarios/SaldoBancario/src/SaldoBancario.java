import java.util.Scanner;

public class SaldoBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double saldoInicial = scanner.nextDouble();


        double transacao = scanner.nextDouble();
        
        double transacao2 = scanner.nextDouble();
      
        double transacao3 = scanner.nextDouble();
        

        double saldoFinal = saldoInicial + transacao + transacao2 + transacao3; ;
        
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}