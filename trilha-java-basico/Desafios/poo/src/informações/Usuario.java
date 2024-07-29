package informações;

import dispositivo.Iphone;
public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("(85)985669102");
        iphone.selecionarMusica("Acreditar - Roberto Ribeiro");
        iphone.exibirPagina("https://github.com/lari2806/dio-trilha-java-basico");
    }
}
