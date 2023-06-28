package openClosed;

public abstract class Animal {
    private String nome;
    private String ambiente;

    public Animal(String nome, String ambiente) {
        this.nome = nome;
        this.ambiente = ambiente;
    }

    public abstract void  emitirSom();
}
