package singleResponsibility;

public class Main {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        Papelaria papelaria = new Papelaria(impressora);

        papelaria.imprimir();
    }
}
