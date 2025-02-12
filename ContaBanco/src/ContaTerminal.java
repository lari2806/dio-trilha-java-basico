import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem-vindo(a)!");
        System.out.println("Digite sua conta: ");
        Scanner numeroScanner = new Scanner(System.in);
        int numero = numeroScanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        Scanner agenciaScanner = new Scanner(System.in);
        String agencia = agenciaScanner.nextLine();

        System.out.println("Digite seu nome: ");
        Scanner nomeClienteScanner = new Scanner(System.in);
        String nomeCliente = nomeClienteScanner.nextLine();

        System.out.println("Digite seu saldo: ");
        Scanner saldoScanner = new Scanner(System.in);
        Float saldo = saldoScanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +  " já está disponível para saque.");
        
        
        numeroScanner.close();
        agenciaScanner.close();
        nomeClienteScanner.close();
        saldoScanner.close();
    }
    
}
