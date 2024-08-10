public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Larissa");
        
        Conta contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.depositar(500);
        Conta contPoupanca = new ContaPoupanca(cliente1);
        contaCorrente.transferir(290, contPoupanca);
        
        contaCorrente.imprimirExtrato();
        contPoupanca.imprimirExtrato();
    }
}
