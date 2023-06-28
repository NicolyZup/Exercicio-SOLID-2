package singleResponsibility;

public class Impressora {
    private String texto;

    public Impressora(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    //Responsabilidade Única
    public String imprimirTexto(){
        return getTexto();
    }
}
