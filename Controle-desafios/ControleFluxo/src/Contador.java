import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {

            contar(parametroUm, parametroDois);

		}catch (ParametrosInvalidosException e) {
            System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		terminal.close();
	}
    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois){
          System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
            for(int indice = 0; indice < contagem; indice++){ 
                System.out.println("imprimindo número " + (indice+1));
            }       
		//realizar o for para imprimir os números com base na variável contagem
	}
}

