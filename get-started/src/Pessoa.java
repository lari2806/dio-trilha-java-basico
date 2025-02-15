import java.time.OffsetDateTime;

public class Pessoa {
    public String Teste(){
        
        return "Teste";
    }
    private String nome;


    private int idade;

    private int idadeAnualmente = OffsetDateTime.now().getYear();

    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 1;
    }


    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public void contarIdade(){
        if(this.idadeAnualmente >= OffsetDateTime.now().getYear()){
             return;
        }
        else{
            this.idade += 1;
            idadeAnualmente = OffsetDateTime.now().getYear();
        }
    }


}
