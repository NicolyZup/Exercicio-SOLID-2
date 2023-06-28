package dependencyInversion;

public class Bradesco implements CaixaEletronico{
    @Override
    public void sacarDinheiro(double valor) {
        System.out.println("Bradesco - valor sacado R$"+valor);
    }
}
