package dependencyInversion;

public class ServicoCaixa {
    private CaixaEletronico caixaEletronico;

    public ServicoCaixa(CaixaEletronico caixaEletronico) {
        this.caixaEletronico = caixaEletronico;
    }

    public void sacarDinheiro(double valor){
        caixaEletronico.sacarDinheiro(valor);
    }
}
