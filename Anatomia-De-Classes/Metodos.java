public class Metodos {
    public static void main(String[] args) {
    String animal = "cachorro";
    String nome = "spaik";
    int idade2 = 6;
    String meuAnimal = meuAnimal(animal, nome, idade2);

    System.out.println(meuAnimal);
    }

    
public static String meuAnimal( String animal, String nome, int idade2){
    return "Eu tenho um " + animal + " ele se chama " + nome + " e tem " + idade2 + " anos.";

}
}
