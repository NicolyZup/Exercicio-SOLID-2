package dependencyInversion;

public class Itau implements CaixaEletronico{
    @Override
    public void sacarDinheiro(double valor) {
        System.out.println("Itau - valor sacado R$"+valor);
    }
}
