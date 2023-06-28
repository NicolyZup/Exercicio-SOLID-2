package openClosed;

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Nemo","Mar","Nadadeira");
        Leao leao = new Leao("Simba","Floresta","Carne");
        Gato gato = new Gato("Mily","Casa","Preta");

        peixe.emitirSom();
        leao.emitirSom();
        gato.emitirSom();
    }
}
