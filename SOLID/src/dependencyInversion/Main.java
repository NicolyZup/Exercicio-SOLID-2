package dependencyInversion;

public class Main {
    public static void main(String[] args) {
        CaixaEletronico caixaBradesco = new Bradesco();
        CaixaEletronico caixaItau = new Itau();

        ServicoCaixa servicoBradesco = new ServicoCaixa(caixaBradesco);
        servicoBradesco.sacarDinheiro(1000);

        ServicoCaixa servicoItau = new ServicoCaixa(caixaItau);
        servicoItau.sacarDinheiro(200);
    }
}
