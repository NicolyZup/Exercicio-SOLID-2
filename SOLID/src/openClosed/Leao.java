package openClosed;

public class Leao extends Animal{
    private String alimentacao;

    public Leao(String nome, String ambiente, String alimentacao) {
        super(nome, ambiente);
        this.alimentacao = alimentacao;
    }

    @Override
    public void emitirSom() {
        System.out.println("grrrrrrr");
    }
}
