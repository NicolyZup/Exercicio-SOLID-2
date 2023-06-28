package singleResponsibility;

public class Animal {
    private String nome;
    private String ambiente;

    public Animal(String nome, String ambiente, String alimentacao) {
        this.nome = nome;
        this.ambiente = ambiente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    //Responsabilidade Única
    public void emitirSom(String som){
        System.out.println(som);
    }
}
