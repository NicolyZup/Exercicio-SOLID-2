package openClosed;

public class Gato extends Animal{
    private String cor;

    public Gato(String nome, String ambiente, String cor) {
        super(nome, ambiente);
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("minhauuuuu");
    }
}
