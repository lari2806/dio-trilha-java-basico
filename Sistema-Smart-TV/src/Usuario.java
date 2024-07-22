public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println(smartTV.ligada);
        System.out.println(smartTV.canal);
        System.out.println(smartTV.volume);
        
        smartTV.ligar();
        System.out.println("Você ligou sua tv. \nSua tv está ligada\n");
        
        smartTV.desligar();
        System.out.println("Você desligou sua tv. \nSua tv está desligada.\n");

        smartTV.aumentarVolume();
        System.out.println("Você aumentou o volume da sua tv, o volume da tv está em " + smartTV.volume + "\n");

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Você diminuiu o volume da sua tv, o volume da tv está em " + smartTV.volume + "\n");


        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        smartTV.novoCanal(5);
    }

}
