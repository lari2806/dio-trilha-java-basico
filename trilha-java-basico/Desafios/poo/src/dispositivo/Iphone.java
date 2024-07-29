package dispositivo;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar(){
        System.out.println("Você está escutando a música: ");
    }
    public void pausar(){
        System.out.println("A música foi pausada");
    }
    public void selecionarMusica(String musica){
        System.out.println("Você selecionou a música: " + musica);
    }
    public void ligar(String numero){
        System.out.println("você está ligando para: " + numero);
    }
    public void atender(){
        System.out.println("Atendendo a ligação.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de voz.");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo Página "+ url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página.");
    }
}
        

