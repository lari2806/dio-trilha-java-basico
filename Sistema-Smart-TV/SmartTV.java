public class SmartTV {
    boolean ligada = false;
    int canal = 10;
    int volume = 50;

    public void ligar(){
        ligada=true;

    }
    public void desligar(){
        ligada=false;

    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Você está aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Você está diminuindo o volume para: " + volume);
    }
    public void aumentarCanal(){
        canal ++;
        System.out.println("Canal atual é " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual é " + canal);
    }
    public void novoCanal(int proximoCanal){
        canal= proximoCanal;
        System.out.println("Canal atual é " + canal);
    }
}    

