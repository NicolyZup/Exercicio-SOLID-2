package interfaceSegregation;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.ligar();
        carro.desligar();

        moto.ligar();
        moto.desligar();
    }
}
