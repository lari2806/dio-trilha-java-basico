public class Main {
    public static void main(String[] args) {
        var masculino = new Pessoa("Savio");
        masculino.contarIdade();

        var feminino = new Pessoa("Larissa");
        feminino.contarIdade();
     

        System.out.println("Nome masculino: " + masculino.getNome() + "\nIdade: " + masculino.getIdade());
        System.out.println("Nome feminino: " + feminino.getNome() + "\nIdade: " + feminino.getIdade());

    }
}
