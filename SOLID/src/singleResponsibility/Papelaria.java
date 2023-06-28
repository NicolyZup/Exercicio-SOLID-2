package singleResponsibility;

import java.util.Scanner;

public class Papelaria {
    Scanner entrada = new Scanner(System.in);
    private Impressora impressora;

    public Papelaria(Impressora impressora) {
        this.impressora = impressora;
    }

    public void imprimir(){
        System.out.println("Bem vindo a Papelaria!");
        System.out.println("--------------------------");
        System.out.println("Informe a palavra que deseja imprimir:");
        String palavra = entrada.next();

        impressora.imprimirTexto(palavra);
    }
}
