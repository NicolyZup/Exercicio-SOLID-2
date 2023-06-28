package openClosed;

public class Peixe extends Animal{

    private String caracteristica;

    public Peixe(String nome, String ambiente, String caracteristica) {
        super(nome, ambiente);
        this.caracteristica = caracteristica;
    }

    @Override
    public void emitirSom() {
        System.out.println("grup grup");
    }
}
