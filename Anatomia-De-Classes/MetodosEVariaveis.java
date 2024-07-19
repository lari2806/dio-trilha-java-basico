public class MetodosEVariaveis{
    public static void main(String[] args) {
        String meuNome = "Larissa";
        int idade = 17;
        String NACIONALIDADE = "brasileira";
        String animal = "cachorro";
        String nome = "spaik";
        int idade2 = 6;
        String meuAnimal = meuAnimal(animal, nome, idade2);

        System.out.println("Olá, meu nome é " + meuNome + " tenho " + idade + " anos e sou " + NACIONALIDADE + ".");
        System.out.println(meuAnimal);
        
    }

    public static String meuAnimal( String animal, String nome, int idade2){
        return "Eu tenho um " + animal + " ele se chama " + nome + " e tem " + idade2 + " anos.";

    }
} 
