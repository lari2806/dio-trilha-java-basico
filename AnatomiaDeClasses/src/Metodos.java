public class Metodos {
    public static void main(String[] args) {
        String meuNome = "Larissa";
        int minhaIdade = 17;
        final String NACIONALIDADE = "brasileira";
    
        String animal = "cachorro";
        String nome = "spaik";
        int idade2 = 6;
        
        String meuAnimal = meuAnimal(animal, nome, idade2);
        String sobreMim = sobreMim(meuNome, minhaIdade, NACIONALIDADE);

        System.out.println(sobreMim);

        System.out.println(meuAnimal);
    }
    public static String sobreMim(String meuNome, int minhaIdade, final String NACIONALIDADE){
        return "Olá, meu nome é " + meuNome + " tenho " + minhaIdade + " anos e sou " + NACIONALIDADE + ".";
    }

    public static String meuAnimal( String animal, String nome, int idade2){
        return "Eu tenho um " + animal + " ele se chama " + nome + " e tem " + idade2 + " anos.";

}
}